package buku;

import buku.Book;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "genre")
public class Genre {
    public Genre() {}
    public Genre(@NotNull String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @JsonIgnore
    @OneToMany(targetEntity = buku.Book.class, mappedBy = "genre", cascade= CascadeType.ALL,orphanRemoval=true)
    private List<Book> books = new ArrayList<>();
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre name(String name) {
        this.name = name;
        return this;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Genre addBook(Book book) {
        books.add(book.genre(this));
        return this;
    }
 
    public void removeBook(Book book) {
        books.remove(book);
        book.setGenre(null);
    }

}