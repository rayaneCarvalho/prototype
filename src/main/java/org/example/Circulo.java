package org.example;

public class Circulo implements Cloneable{

    private Forma altura;
    private Forma largura;
    private double radius;

    public Circulo(Forma altura, Forma largura, double radius) {
        this.altura = altura;
        this.largura = largura;
        this.radius = radius;
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    @Override
    public Circulo clone() throws CloneNotSupportedException {
        Circulo quadradoClone = (Circulo) super.clone();
        quadradoClone.altura = (Forma) quadradoClone.altura.clone();
        return quadradoClone;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "Altura = " + altura +
                "Largura = " + largura +
                ", Radius ='" + radius  + '}';
    }
}