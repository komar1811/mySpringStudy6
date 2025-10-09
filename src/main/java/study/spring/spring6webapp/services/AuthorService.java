package study.spring.spring6webapp.services;

import study.spring.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
