package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public Optional<Book> getBookById(Long id) {
        return repo.findById(id);
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book addBook(String title, String author, Double price) {
        return repo.save(new Book(title, author, price));
    }
}
