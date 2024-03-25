package org.example;

public class Quadrado implements Cloneable{

    private Forma altura;
    private Forma largura;
    private String cor;

    public Quadrado(String cor) {
        this.cor = cor;
    }

    public Forma getAltura() {
        return altura;
    }
    public void setAltura(Forma altura) {
        this.altura = altura;
    }
    public Forma getLargura() {
        return largura;
    }
    public void setLargura(Forma largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }



    @Override
    public Quadrado clone() throws CloneNotSupportedException {
        Quadrado quadradoClone = (Quadrado) super.clone();
        quadradoClone.altura = (Forma) quadradoClone.altura.clone();
        return quadradoClone;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "Altura = " + altura +
                "Largura = " + largura +
                ", cor ='" + cor  + '}';
    }
}