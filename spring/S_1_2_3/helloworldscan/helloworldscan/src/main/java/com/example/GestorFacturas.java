package com.example;

import org.springframework.stereotype.Component;

@Component
public class GestorFacturas {

    Calculadora calculadora;

    public GestorFacturas(Calculadora calculadora) {
        System.out.println("GestorFacturas constructor");
        this.calculadora = calculadora;
    }

}
