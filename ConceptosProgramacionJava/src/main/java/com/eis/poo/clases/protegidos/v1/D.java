package com.eis.poo.clases.protegidos.v1;

public class D extends B {
    private String d1;
    private String d2;

    public D(String d1, String d2) {
        super(1,1);
        this.d1 = d1;
        this.d2 = d2;
    }

    public String mensaje() {

        return "Texto: "+ d1 + " " + d2 + " Valor: " + super.calcular();

    }
    public double promediar() {
        return (double) super.calcular() /2;

    }
}
