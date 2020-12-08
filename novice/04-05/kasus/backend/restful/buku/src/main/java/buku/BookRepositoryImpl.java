package buku;

import buku.Book;

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import io.micronaut.spring.tx.annotation.Transactional;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Singleton
public class BookRepositoryImpl implements BookRepository {

    @PersistenceContext
    private EntityManager entityManager;
    private final ApplicationConfiguration applicationConfiguration;

    public BookRepositoryImpl(@CurrentSession EntityManager entityManager,
        ApplicationConfiguration applicationConfiguration) {
            this.entityManager = entityManager;
            this.applicationConfiguration = applicationConfiguration;
        }

    @Override
    @Transactional(readOnly = true)
    public Optional<Book> findById(@NotNull Long id) {
        return Optional.ofNullable(entityManager.find(Book.class, id));
    }

    @Override
    @Transactional
    public Book save(@NotBlank String author, @NotBlank String name, Genre genre) {
        Book book = new Book(author, name, genre);
        
        if (book.genre(genre) == null) {
            entityManager.persist(book);
        } else if (book.genre(genre) != null){
            book = entityManager.merge(book);
        } else {
            book = entityManager.merge(book);
        }

        

        return book;
    }

    @Override
    @Transactional
    public void deleteById(@NotNull Long id) {
        findById(id).ifPresent(book -> entityManager.remove(book));    
    }

    private final static List<String> VALID_PROPERTY_NAMES = Arrays.asList("id", "author", "name", "genre_id");

    @Transactional(readOnly = true)
    public List<Book> findAll (@NotNull SortingAndOrderArguments args) {
        String qlString = "SELECT b FROM Book as b";
        if (args.getOrder().isPresent() && args.getSort().isPresent() && VALID_PROPERTY_NAMES.contains(args.getSort().get())) {
            qlString += " ORDER BY b." + args.getSort().get() + " " + args.getOrder().get().toLowerCase();
        }
        TypedQuery<Book> query = entityManager.createQuery(qlString, Book.class);
        query.setMaxResults(args.getMax().orElseGet(applicationConfiguration::getMax));
        args.getOffset().ifPresent(query::setFirstResult);

        return query.getResultList();
    }

    @Override
    @Transactional
    public int update(@NotNull Long id, @NotBlank String author, @NotBlank String name, Genre genre) {
        return entityManager.createQuery("UPDATE Book b SET author = :author, name = :name, genre_id = :genre where id = :id")
            .setParameter("author", author)
            .setParameter("name", name)
            .setParameter("genre", genre)
            .setParameter("id", id)
            .executeUpdate();
    }

}