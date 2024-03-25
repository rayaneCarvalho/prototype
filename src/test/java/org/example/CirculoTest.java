package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Quadrado quadrado = new Quadrado(123.25, 253.40, new Forma(10.4, 4));

        Quadrado quadradoClone = quadrado.clone();
        quadradoClone.setCodigo(456);
        quadradoClone.setNome("Camiseta");
        quadradoClone.getForma().setQuantidade(2);

        assertEquals("Quadrado{código = 123, nome ='Camisa', Forma =Forma{modelo ='Esportiva', Quantidade =4}}", quadrado.toString());
        assertEquals("Quadrado{código = 456, nome ='Camiseta', Forma =Forma{modelo ='Esportiva', Quantidade =2}}", quadradoClone.toString());
    }

}