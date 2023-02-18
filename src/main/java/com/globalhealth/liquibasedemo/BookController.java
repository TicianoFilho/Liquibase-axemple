package com.globalhealth.liquibasedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from Coding World";
    }

    @GetMapping
    public List<Book> getAllBooks() {
        List<Book> books= (List<Book>) bookRepository.findAll();
        return books;
    }
}
