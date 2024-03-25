package org.example;

public class Forma implements Cloneable {
    private double altura;
    private double largura;

    public Forma(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getaltura() {
        return altura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    public double getlargura() {
        return largura;
    }

    public void setlargura(double largura) {
        this.largura = largura;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Altura = " +
                altura + '\'' +
                ", Largura =" + largura;
    }
}
