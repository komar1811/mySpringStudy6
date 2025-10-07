package study.spring.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import study.spring.spring6webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {


}
