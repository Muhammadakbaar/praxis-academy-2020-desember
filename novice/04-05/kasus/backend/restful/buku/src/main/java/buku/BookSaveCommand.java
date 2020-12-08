package buku;

import buku.Genre;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class BookSaveCommand {

    @NotBlank
    private String author,name;
    
    private Genre genre;

    public BookSaveCommand() {}

    public BookSaveCommand(String author, String name, Genre genre) {
        this.author = author;
        this.name = name;
        this.genre = genre;
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