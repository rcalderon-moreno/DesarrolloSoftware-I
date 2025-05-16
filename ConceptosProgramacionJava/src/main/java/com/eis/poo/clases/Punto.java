
package com.eis.poo.clases;

public class Punto {

    private int valorEnX;
    private int valorEnY;

    private int suma(){ return this.valorEnX + this.valorEnY; }

    public Punto() {
        this.valorEnX =0;
        this.valorEnY =0;
    }
    public Punto(int x , int y) {
        this.valorEnX =x;
        this.valorEnY =y;
    }

    public int getValorEnX() {
        return valorEnX;
    }
    public void setValorEnX(int valorEnX) {
        this.valorEnX = valorEnX;
    }
    public int getValorEnY() {
        return valorEnY;
    }
    public void setValorEnY(int valorEnY) {
        this.valorEnY = valorEnY;
    }

}

