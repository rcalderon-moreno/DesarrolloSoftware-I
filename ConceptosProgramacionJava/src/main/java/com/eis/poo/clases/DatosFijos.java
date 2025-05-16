package com.eis.poo.clases;

public class DatosFijos {

    private static String ruta;
    private static double porcentaje;
    private static double contadorObjetos = 0;
    public static double valorMatriculaModificable;
    public static final double valorMatriculaFijo ;

    static {
        //el operador this no aplica a static
        ruta="http://localhost:8080";
        porcentaje=100;
        valorMatriculaFijo=1000000;
        valorMatriculaModificable=0;
    }

    public DatosFijos() {
        contadorObjetos++;
    }

    public static double getContadorObjetos() {
        return contadorObjetos;
    }

    public static String getRuta() {
        return ruta;
    }

    public static void setRuta(String ruta) {
        DatosFijos.ruta = ruta;
    }

    public static double getPorcentaje() {
        return porcentaje;
    }

    public static void setPorcentaje(double porcentaje) {
        DatosFijos.porcentaje = porcentaje;
    }
}