package com.eis.conceptos;

import java.util.Date;

public class TiposDatos {

    public static void main(String[] args) {

        String cadena="abc";
        int x=0;
        double y=5;
        int X=10;
        Integer h=123;
        Date valor=new Date();

        System.out.println("");
        System.out.println("Texto");
        System.out.println("Texto " + cadena);
        System.out.println("Valor de X " + X);
        System.out.println("Valor de x " + x);
        System.out.println("Valor de y " + y);
        System.out.println("Suma de x+y " +x+y);
        System.out.println("Suma de x+y " + (x+ y) );
        System.out.println("Integer h " + h);
        System.out.println("Date valor  " + valor );
    }
}

