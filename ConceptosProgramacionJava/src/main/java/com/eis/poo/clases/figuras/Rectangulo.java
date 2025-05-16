package com.eis.poo.clases.figuras;

public class Rectangulo  extends FiguraGeometrica {
    private double ladoUno;
    private double ladoDos;

    public Rectangulo(double ladoUno, double ladoDos) {
        super("Rectángulo","Amarillo");
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }

    @Override
    public Double calcularArea() {
        return this.ladoUno * this.ladoDos;
    }
}
