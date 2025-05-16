package com.eis.conceptos;

import com.eis.poo.clases.ArgumentosVariables;
import com.eis.poo.clases.Punto;
import com.eis.poo.clases.figuras.Circulo;
import com.eis.poo.clases.figuras.Triangulo;


public class Argumentos     {
    public static void main(String[] args) {

        ArgumentosVariables argumentosVariables=new ArgumentosVariables("*","-","+");

        argumentosVariables.metodo1(1,2,3);

        argumentosVariables.metodo2("Puntos", new Punto(5,10),new Punto(5,15),new Punto(5,20));

        argumentosVariables.metodo3(new Triangulo(2,2),new Circulo(9.6));
    }
}
