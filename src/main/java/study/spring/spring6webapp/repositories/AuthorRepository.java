package study.spring.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import study.spring.spring6webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
