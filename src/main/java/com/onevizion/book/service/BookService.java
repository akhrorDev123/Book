package com.onevizion.book.service;

import com.onevizion.book.entity.Book;
import com.onevizion.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> allByTitleDesc() {
        return bookRepository.findAllByDescTitle();
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findByAuthor(String author) {
        return bookRepository.findAllByAuthor(author);
    }
}
