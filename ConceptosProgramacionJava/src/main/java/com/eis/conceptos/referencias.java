package com.eis.conceptos;

import com.eis.poo.clases.DatosFijos;

public class referencias {


    public referencias() {





    }

    public static void main(String[] args) {


        System.out.println("Valor de ruta " + DatosFijos.getRuta());
        System.out.println("Valor de porcentaje " + DatosFijos.getPorcentaje());
        System.out.println("Valor de valorMatriculaFijo " + DatosFijos.valorMatriculaFijo );
        System.out.println("Valor de valorMatriculaModificable " + DatosFijos.valorMatriculaModificable);

        DatosFijos.valorMatriculaModificable=0;
        // Error al acceder
        // DatosFijos.valorMatriculaFijo=0;
        System.out.println("Valor modificado de valorMatriculaModificable " + DatosFijos.valorMatriculaModificable);

        System.out.println("Contador de objetos " + DatosFijos.getContadorObjetos());
        DatosFijos datos = new DatosFijos();
        System.out.println("Valor de ruta " + datos.getRuta());
        datos = new DatosFijos();
        datos = new DatosFijos();
        System.out.println("Contador de objetos " + DatosFijos.getContadorObjetos());



//        Punto punto1;
//        punto1=new Punto();
//
//        Punto punto2;
//        punto2=new Punto(5,12);
//
//        Punto punto3;
//        punto3=punto1;

//        System.out.println("Referencia del objeto p1 " + punto1.toString() );
//        System.out.println("Referencia del objeto p2 " + punto2.toString() );
//        System.out.println("Referencia del objeto p3 " + punto3.toString() );
//        System.out.println("Valores de p1: " + punto1.getValorEnX() + " - " + punto1.getValorEnY() );
//        System.out.println("Valores de p2: " + punto2.getValorEnX() + " - " + punto2.getValorEnY() );
//        System.out.println("Valores de p3: " + punto3.getValorEnX() + " - " + punto3.getValorEnY() );

//
//        OperacionesObjetos operacionesObjetos =new OperacionesObjetos();
//        int valor=0;
//        Punto punto4=new Punto();
//
//        System.out.println("Valores de x: " + valor );
//        operacionesObjetos.cambiarDatos(valor);
//        System.out.println("Valores después de  llegar a al método ");
//        System.out.println("Valores de x: " + valor );
//
//        System.out.println("****Valores iniciales de  punto4***");
//        System.out.println("Referencia del objeto punto4 " + punto4.toString() );
//        System.out.println("Valores de punto4: " + punto4.getValorEnX() + " , " + punto4.getValorEnY() );
//
//        operacionesObjetos.cambiarDatos(punto4);
//
//        System.out.println("Valores después de modificar en el método p4 ");
//        System.out.println("Referencia del objeto punto4 " + punto4.toString() );
//        System.out.println("Valores de punto4: " + punto4.getValorEnX() + " , " + punto4.getValorEnX() );



    }
}



