package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Circulo circulo = new Circulo(5.6, new Forma("Círculo", "Preto"));

        Circulo circuloClone = circulo.clone();
        circuloClone.setRadius(4.5);
        circuloClone.getForma().setCor("Azul");

        assertEquals("Circulo{Radius =5.6, Forma =Forma{Forma =Círculo, Cor =Preto}}", circulo.toString());
        assertEquals("Circulo{Radius =4.5, Forma =Forma{Forma =Círculo, Cor =Azul}}", circuloClone.toString());
    }

}