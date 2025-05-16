package com.eis.poo.clases;

import com.eis.poo.clases.figuras.FiguraGeometrica;

public class ClienteFiguras {

    private FiguraGeometrica[] listadoFiguras;
    private int cantidad;
    public ClienteFiguras() {
        this.listadoFiguras = new FiguraGeometrica[5];
        this.cantidad = 0;
    }

    public void adicionarFigura(FiguraGeometrica figura) {
        this.listadoFiguras[this.cantidad] = figura;
        this.cantidad++;
    }
    public int cantidadFiguras(){
        return this.cantidad;
    }

    public String imprimirFiguras(){
        String cadena = "";
        for (int i = 0; i < this.cantidad; i++)
            cadena = cadena + "\n" + this.listadoFiguras[i].imprimir();

        return cadena;
    }

}
