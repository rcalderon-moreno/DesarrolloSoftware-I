package com.eis.conceptos;

import com.eis.poo.clases.personal.Empleado;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HerenciaAplicada {

    public static void main(String[] argumentos) throws ParseException {

        System.out.println("---------------------------------------------------------------");

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaIngreso = new Date();
        fechaIngreso = formatoFecha.parse("05-04-2015");

        Empleado empleado1 = new Empleado("Administrador", fechaIngreso, 9500000, 86072521, "JUAN FELIPE", "MORALES DIAZ");
        Empleado empleado2 = new Empleado("Desarrollador A", fechaIngreso, 5500000, 87111222, "ANRDES", "CARDENAS");
        Empleado empleado3 = new Empleado("Desarrollador B", fechaIngreso, 3500000, 89521231, "FELIPE", "ROA");

        System.out.println("Empleado: " + empleado1.getNombres() + " " + empleado1.getApellidos());
        BigDecimal valor = BigDecimal.valueOf(empleado1.getIdentificacion());
        System.out.println("Identificación: " + valor + " Fecha Ingreso: " + formatoFecha.format(empleado1.getFechaIngreso())  );
        valor = BigDecimal.valueOf(empleado1.getSalario());
        System.out.println("Salario: " + valor);

        System.out.println("---------------------------------------------------------------");
    }

}
