package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Quadrado quadrado = new Quadrado("verde", new Forma(14.4, 4.7));

        Quadrado quadradoClone = quadrado.clone();
        quadradoClone.setCodigo(456);
        quadradoClone.setNome("Camiseta");
        quadradoClone.getModelo().setQuantidade(2);

        assertEquals("Quadrado{código = 123, nome ='Camisa', Modelo =Modelo{modelo ='Esportiva', Quantidade =4}}", quadrado.toString());
        assertEquals("Quadrado{código = 456, nome ='Camiseta', Modelo =Modelo{modelo ='Esportiva', Quantidade =2}}", quadradoClone.toString());
    }

}