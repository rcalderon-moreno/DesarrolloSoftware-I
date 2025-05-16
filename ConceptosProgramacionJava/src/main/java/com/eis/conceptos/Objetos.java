
package com.eis.conceptos;
import com.eis.poo.clases.personal.Persona;

public class Objetos {

    public static void main(String[] args) {

        Persona objetoPersona =new Persona();
        Persona persona;

        persona =new Persona(123,"MARIANA","ROMERO");
        System.out.println("---------------------------------------------------------------");
        System.out.println("objetoPersona: "+ objetoPersona.informacionPersona());
        System.out.println("Persona: "+ persona.informacionPersona());
        System.out.println("---------------------------------------------------------------");
        System.out.println("objetoPersona identificación: "+ objetoPersona.IdPersona());
        System.out.println("Persona identificación: "+ persona.getIdentificacion());
        System.out.println("---------------------------------------------------------------");

        Persona[] listadoPersona =new Persona[5];
        listadoPersona[0]=objetoPersona;
        listadoPersona[1]=persona;

        System.out.println("--LISTADO DE PERSONA--------------------------------------------");
        listadoPersona[0].informacionPersona();
        listadoPersona[1].informacionPersona();
        System.out.println("listadoPersona[0]: "+ listadoPersona[0].informacionPersona());
        System.out.println("listadoPersona[1]: "+ listadoPersona[1].informacionPersona());

    }
}


