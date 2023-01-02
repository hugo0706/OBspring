package com.example.obrestdatajpa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repositories.BookRepository;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);
		BookRepository repository = context.getBean(BookRepository.class);

		Book book1 = new Book(null, "The Lord of the Rings", "J.R.R. Tolkien", 1216, 19.90, null, true);
		Book book2 = new Book(null, "The Lord of the Rings", "J.R.R. Tolkien", 1216, 19.90, null, true);

		repository.save(book1);
		repository.save(book2);

	}

}
