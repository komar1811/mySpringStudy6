package study.spring.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import study.spring.spring6webapp.domain.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
