package kasus.gateway;

import io.reactivex.Flowable;

public interface BooksFetcher {
	Flowable<Book> fetchBooks();
}
