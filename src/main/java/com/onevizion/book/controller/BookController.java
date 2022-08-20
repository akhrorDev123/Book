package com.onevizion.book.controller;

import com.onevizion.book.entity.Book;
import com.onevizion.book.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<?> allBooksByTitleDesc() {
        List<Book> books = bookService.allByTitleDesc();
        return ResponseEntity.status(books.isEmpty() ? 204 : 200).body(books);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Book book) {
        Book savedBook = bookService.save(book);
        return ResponseEntity.status(201).body(savedBook);
    }

    @GetMapping("/author")
    public ResponseEntity<?> getByAuthor(@RequestParam String author) {
        List<Book> books = bookService.findByAuthor(author);
        return ResponseEntity.status(books.isEmpty() ? 204 : 200).body(books);
    }
}
