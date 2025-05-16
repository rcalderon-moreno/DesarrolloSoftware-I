package com.eis.poo.clases.sobrecarga;

public class Procesar2 extends Procesar {

    int valorX;


    public Procesar2(int valorX, int valorY) {
        super(valorX, valorY);
        this.valorX = 5;
    }

    @Override
    public int calcularX(){
        return super.valorX * 10;
    }

    public int promedio(){
        return super.valorX / 2;
    }


}