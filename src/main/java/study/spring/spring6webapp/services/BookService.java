package study.spring.spring6webapp.services;

import study.spring.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
