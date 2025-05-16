package com.eis.poo.clases.figuras;

public abstract class  FiguraGeometrica {
    private String nombre;
    private String color;
    protected Double valorArea;

    public abstract Double calcularArea() ;

    protected FiguraGeometrica(String nombre, String color ) {
        this.nombre = nombre;
        this.color = color;
        this.valorArea = 0.0;
    }
    public String imprimir  (){
        return "\tNombre:" + nombre + "\tColor:" + color + "\tArea:" + this.calcularArea();
    }
}



