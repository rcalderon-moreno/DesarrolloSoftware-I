package com.eis.conceptos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EntradaSalidaUno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = 0;
        String texto = "" ;

        System.out.print("Ingrese un valor: ");
        valor=entrada.nextDouble();
        System.out.print("Valor: " + valor + "\n");

        System.out.print("Ingrese la edad(años): ");
        int edad = entrada.nextInt();
        System.out.println("Edad registrada:" + edad + "\n");

        System.out.println("Ingrese una cadena de texto: ");
        texto=entrada.next();
        System.out.print("Texto registrado: " + texto + "\n");

        System.out.print("Ingrese una cadena de texto: ");
        entrada.nextLine(); // limpiar el salto de línea pendiente -- al usar  nextInt(), nextDouble(), etc., y luego nextLine()
        texto=entrada.nextLine();
        System.out.print("Texto registrado: " + texto + "\n");

        entrada.close();
    }
}
