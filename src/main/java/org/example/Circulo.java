package org.example;

public class Circulo implements Cloneable{

    private Forma forma;
    private double radius;

    public Circulo(double radius, Forma forma) {
        this.radius = radius;
        this.forma = forma;
    }

    public Forma getForma() {
        return forma;
    }
    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    @Override
    public Circulo clone() throws CloneNotSupportedException {
        Circulo circuloClone = (Circulo) super.clone();
        circuloClone.forma = (Forma) circuloClone.forma.clone();
        return circuloClone;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "Radius =" + radius +
                ", Forma =" + forma  + "}";
    }
}