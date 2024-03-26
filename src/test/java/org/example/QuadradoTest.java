package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Retangulo retangulo = new Retangulo(5.6, 7.5, new Forma("Retangulo", "Verde"));

        Retangulo retanguloClone = retangulo.clone();
        retanguloClone.setAltura(4.5);
        retanguloClone.setLargura(8.0);
        retanguloClone.getForma().setCor("Roxo");

        assertEquals("Retangulo{Altura =5.6, Largura =7.5, Forma =Forma{Forma =Retangulo, Cor =Verde}}", retangulo.toString());
        assertEquals("Retangulo{Altura =4.5, Largura =8.0, Forma =Forma{Forma =Retangulo, Cor =Roxo}}", retanguloClone.toString());
    }


}