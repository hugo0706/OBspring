package com.example.obsprindatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObsprindatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObsprindatajpaApplication.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("Numero de elementos "+ repository.count());
		Coche toyota= new Coche(null, "Toyota", "Corolla", 2010);
		repository.save(toyota);
		System.out.println("Numero de elementos "+ repository.count());
		

	}

}
