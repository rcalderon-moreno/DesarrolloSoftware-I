package com.eis.poo.clases;

public class Rectangulo {

    private int ancho, alto;
    private Punto inicio;

    public Rectangulo() {
        this(0,0);
    }

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.inicio=new Punto();
    }
    public Rectangulo(Punto inicio,int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.inicio=inicio;
    }
}


