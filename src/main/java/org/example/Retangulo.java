package org.example;

public class Retangulo implements Cloneable{

    private double altura;
    private double largura;
    private Forma forma;

    public Retangulo(double altura, double largura, Forma forma) {
        this.altura = altura;
        this.largura = largura;
        this.forma = forma;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public Forma getForma() {
        return forma;
    }
    public void setForma(Forma forma) {
        this.forma = forma;
    }



    @Override
    public Retangulo clone() throws CloneNotSupportedException {
        Retangulo retanguloClone = (Retangulo) super.clone();
        retanguloClone.forma = (Forma) retanguloClone.forma.clone();
        return retanguloClone;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "Altura =" + altura +
                ", Largura =" + largura  +
                ", Forma =" + forma  + "}";
    }
}