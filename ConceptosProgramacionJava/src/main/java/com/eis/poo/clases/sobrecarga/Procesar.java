package com.eis.poo.clases.sobrecarga;

public class Procesar {

    protected int valorX;
    protected int valorY;

    public Procesar(int valorX, int valorY) {
        this.valorX = valorX;
        this.valorY = valorY;
    }

    public int calcularX(){
        return valorX * 10;
    }

    public int calcularY(){
        return valorY * -10;
    }
}
