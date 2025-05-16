package com.eis.poo.clases.figuras;

public class Circulo  extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio) {
        super("Círculo","Azul");
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}
