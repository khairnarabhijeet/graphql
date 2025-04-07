package com.example.demo;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(BookRepository repo) {
        return args -> {
            repo.save(new Book("Spring Boot GraphQL", "Abhijeet", 499.99));
            repo.save(new Book("Effective Java", "Joshua Bloch", 799.99));
        };
    }
}

