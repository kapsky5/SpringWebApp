package com.kapsky.simplewebapp.bootstrap;

import com.kapsky.simplewebapp.domain.Author;
import com.kapsky.simplewebapp.domain.Book;
import com.kapsky.simplewebapp.repositories.AuthorRepository;
import com.kapsky.simplewebapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author auth1 = new Author("HC", "Verma");
        Book book1 = new Book("ConOfPhy", "123132");
        auth1.getBooks().add(book1);
        book1.getAuthors().add(auth1);
        authorRepository.save(auth1);
        bookRepository.save(book1);

        Author auth2 = new Author("CL", "RS");
        Book book2 = new Book("DSA", "123145");
        auth2.getBooks().add(book2);
        book2.getAuthors().add(auth2);
        authorRepository.save(auth2);
        bookRepository.save(book2);

        System.out.println("Started in bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
    }
}
