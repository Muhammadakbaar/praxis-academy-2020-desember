package example.micronaut;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.reactivex.Flowable;

@Client("books")
@Requires(notEnv = Environment.TEST)

public interface BooksClient extends BooksFetcher {

    @Get("/api/books") Flowable<Book> fetchBooks();
}
