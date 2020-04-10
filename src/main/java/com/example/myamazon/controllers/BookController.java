package com.example.myamazon.controllers;

import com.example.myamazon.models.Book;
import com.example.myamazon.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    private final BookRepository bookRepository;

    BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping("/book")
    Book post(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/book/{id}")
    Book getOne(@PathVariable Long id) {
        Optional<Book> optBook = bookRepository.findById(id);
        return optBook.isPresent() ? optBook.get() : null;
    }

    @GetMapping("/books")
    List<Book> getAll() {
        List<Book> books = bookRepository.findAll();
        return books;
    }
}
