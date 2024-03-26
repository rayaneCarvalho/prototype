package org.example;

public class Forma implements Cloneable {
    private String forma;
    private String cor;

    public Forma(String forma, String cor) {
        this.forma = forma;
        this.cor = cor;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Forma{" +
                "Forma =" + forma +
                ", Cor =" + cor  + "}";
    }
}
