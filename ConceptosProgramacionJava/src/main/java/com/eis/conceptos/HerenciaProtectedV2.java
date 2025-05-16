package com.eis.conceptos;

import com.eis.poo.clases.protegidos.v2.B;
import com.eis.poo.clases.protegidos.v2.D;

import java.text.ParseException;

public class HerenciaProtectedV2 {
    public static void main(String[] argumentos) throws ParseException {
        B b = new B(1,1);
        D d = new D("Texto1","Texto2");

        System.out.println("Calcular de B: " + b.calcular());
        System.out.println("Mensaje de D: " + d.mensaje());
        System.out.println("Promedio de D: " + d.promediar() );



    }

}
