package study.spring.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import study.spring.spring6webapp.domain.Author;
import study.spring.spring6webapp.domain.Book;
import study.spring.spring6webapp.domain.Publisher;
import study.spring.spring6webapp.repositories.AuthorRepository;
import study.spring.spring6webapp.repositories.BookRepository;
import study.spring.spring6webapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,  PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        eric.setFirstName("Rod");
        eric.setLastName("Johnson");

        Book noEJB = new Book();
        ddd.setTitle("J2EE Development without EJB");
        ddd.setIsbn("54757585");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        Publisher sherlockPublisher = new Publisher();
        sherlockPublisher.setAddress("BakerStreet 221b");
        sherlockPublisher.setCity("London");
        sherlockPublisher.setPublisherName("Sherlock Times");
        sherlockPublisher.setState("Great Britain");
        sherlockPublisher.setZipCode("31-432");

        Publisher sherlockPublisherSaved = publisherRepository.save(sherlockPublisher);

        dddSaved.setPublisher(sherlockPublisherSaved);
        noEJBSaved.setPublisher(sherlockPublisherSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());

    }
}
