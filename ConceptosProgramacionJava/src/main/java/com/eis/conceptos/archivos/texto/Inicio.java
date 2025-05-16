/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eis.conceptos.archivos.texto;

import com.eis.poo.clases.personal.Empleado;
import com.eis.poo.clases.personal.Persona;

import java.text.ParseException;
import java.util.Date;



public class Inicio {
    public static void main(String []argumentos  ) throws ParseException
    {
        
        Ejemplo1 a1 =new Ejemplo1();

        System.out.println("---------Escribir en el archivo ----------------------------");
        a1.escribirArchivo();
        System.out.println("---------Leer del archivo por linea----------------------------");
        a1.leerArchivo();
        System.out.println("---------Escribir en el archivo por caracter ----------------------------");
        a1.escribirArchivoPorCaracter();
        System.out.println("---------Leer del archivo por caracter----------------------------");
        a1.leerArchivoPorCaracter();        
        
         Ejemplo2 a2 =new Ejemplo2();
         Date ahora = new Date();
         Empleado ob = new Empleado("Administrador", ahora, 2000000,86987222,"JUAN ANDRES","MORALES DIAZ");
         Empleado ob1= new Empleado("Auxiliar 1", ahora, 1688780,7222,"ANDRES","MORALES DIAZ");
         Empleado ob2 = new Empleado("Auxiliar 2 ", ahora, 1300000,987222,"JUAN ","MORALES ");
         Empleado ob3 = new Empleado("Auxiliar 1", ahora, 1300000,6987222,"JOSE","DIAZ");
         Empleado ob4 = new Empleado("Auxiliar 3", ahora, 1405000,987222,"PEDRO","MARTINEZ");
         
         System.out.println("---------Escribir en el archivo objetos de tipo persona ----------------------------");
         
         a2.escribirArchivo((Persona)ob);
         a2.escribirArchivo((Persona)ob1);
         a2.escribirArchivo((Persona)ob2);
         a2.escribirArchivo((Persona)ob3);
         a2.escribirArchivo((Persona)ob4);
        
        
         System.out.println("---------Leer del archivo objetos de tipo persona ----------------------------");
         a2.leerArchivo("personas.txt");
     
         System.out.println("---------Escribir en el archivo objetos de tipo empleado ----------------------------");
         
         a2.escribirArchivo(ob);
         a2.escribirArchivo(ob1);
         a2.escribirArchivo(ob2);
         a2.escribirArchivo(ob3);
         a2.escribirArchivo(ob4);        
        
         System.out.println("---------Leer del archivo objetos de tipo empleado ----------------------------");
         a2.leerArchivo("empleados.txt");
         
        
    }
}
