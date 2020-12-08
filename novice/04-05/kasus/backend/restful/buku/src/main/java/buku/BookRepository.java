package buku;

import buku.Book;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface BookRepository {

    Optional<Book> findById(@NotNull Long id);

    Book save(@NotBlank String author, @NotBlank String name, Genre genre);

    void deleteById(@NotNull Long id);

    List<Book> findAll(@NotNull SortingAndOrderArguments args);
    int update (@NotNull Long id, @NotBlank String author, @NotBlank String name, Genre genre);
}