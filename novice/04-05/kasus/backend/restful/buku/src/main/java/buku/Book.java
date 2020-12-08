package buku;

import buku.Genre;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "book")
public class Book {
    
    public Book() {}

    public Book(@NotNull String author, @NotNull String name, Genre genre) {
        this.author = author;
        this.name = name;
        this.genre = genre;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "author", nullable = false)
    private String author;

    
    @ManyToOne(targetEntity=buku.Genre.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "genre_id", referencedColumnName="id")
    private Genre genre;

    public Long getId() {
        return id;
    }

    public Book setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }    

    public void setName(String name) {
        this.name = name;
    }

    public Book name(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    } 

    public Book author(String author) {
        this.author = author;
        return this;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Book genre(Genre genre) {
        this.genre = genre;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book{");
        sb.append("id=");
        sb.append(id);
        sb.append(", name='");
        sb.append(name);
        sb.append("', author='");
        sb.append(author);
        sb.append("', genre_id='");
        sb.append(genre);
        sb.append("'}");
        return sb.toString();
    }   

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book )) return false;
        return id != null && id.equals(((Book) o).getId());
        
    }
    @Override
    public int hashCode() {
        return 31;
    }
}