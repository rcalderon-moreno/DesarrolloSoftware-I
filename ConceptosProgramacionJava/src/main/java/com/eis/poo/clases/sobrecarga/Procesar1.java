package com.eis.poo.clases.sobrecarga;

public class Procesar1 extends Procesar {

    int valorX;

    public Procesar1(int valorX, int valorY) {
        super(valorX, valorY);
        this.valorX = 5;
    }

    @Override
    public int calcularX(){
        return this.valorX * 10;
    }


}
