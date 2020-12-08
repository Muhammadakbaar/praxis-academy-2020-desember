package buku;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class BookUpdateCommand {
    @NotNull
    private Long id;

    @NotBlank
    private String author,name;
    
    private Genre genre;

    public BookUpdateCommand() {}

    public BookUpdateCommand(Long id, String author, String name, Genre genre) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}