package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");
        String text= calculadora.holaMundo();
        System.out.println(text);

        GestorFacturas gestor= (GestorFacturas) context.getBean("gestorFacturas");
        

    }
}
