package study.spring.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import study.spring.spring6webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
