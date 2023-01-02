package com.example.obrestdatajpa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repositories.BookRepository;

@RestController
public class BookController {
    
    private BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/books")
    public List<Book> findAll(){
        return repository.findAll();
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> findOneById(@PathVariable Long id){        
        Optional<Book> bookOpt = repository.findById(id);        
        if(bookOpt.isPresent()){
            return ResponseEntity.ok(bookOpt.get());
        }else{          
            return ResponseEntity.notFound().build();
        }
        
        //return bookOpt.orElse(null);
    }

    @PostMapping("/books")
    public Book craeate(@RequestBody Book book ,@RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        return repository.save(book);
    }
}
