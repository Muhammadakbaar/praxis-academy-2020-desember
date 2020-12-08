package buku;

import buku.Book;
import buku.GenreRepository;
import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.validation.Validated;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@Validated 
@Controller("/books") 
public class BookController {

    protected final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) { 
        this.bookRepository = bookRepository;
    }

    @Get("/{id}") 
    public Book show(Long id) {
        return bookRepository
                .findById(id)
                .orElse(null); 
    }

    @Put("/") 
    public HttpResponse update(@Body @Valid BookUpdateCommand command) { 
        int numberOfEntitiesUpdated = bookRepository.update(command.getId(), command.getAuthor(), command.getName(), command.getGenre());

        return HttpResponse
                .noContent()
                .header(HttpHeaders.LOCATION, location(command.getId()).getPath()); 
    }

    @Get(value = "/list{?args*}") 
    public List<Book> list(@Valid SortingAndOrderArguments args) {
        return bookRepository.findAll(args);
    }

    @Post("/") 
    public HttpResponse<Book> save(@Body @Valid BookSaveCommand cmd) {
        Book book = bookRepository.save(cmd.getAuthor(), cmd.getName(), cmd.getGenre());
        

        return HttpResponse
                .created(book)
                .headers(headers -> headers.location(location(book.getId())));
    }

    @Delete("/{id}") 
    public HttpResponse delete(Long id) {
        bookRepository.deleteById(id);
        return HttpResponse.noContent();
    }

    protected URI location(Long id) {
        return URI.create("/books/" + id);
    }

    protected URI location(Book book) {
        return location(book.getId());
    }
}