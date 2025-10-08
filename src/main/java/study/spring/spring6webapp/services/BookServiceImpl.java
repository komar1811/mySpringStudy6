package study.spring.spring6webapp.services;

import org.springframework.stereotype.Service;
import study.spring.spring6webapp.domain.Book;
import study.spring.spring6webapp.repositories.BookRepository;

@Service
public class BookServiceImpl {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

//    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
