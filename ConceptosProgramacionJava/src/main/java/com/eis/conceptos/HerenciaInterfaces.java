package com.eis.conceptos;

import com.eis.poo.clases.interfaces.Deuda;
import com.eis.poo.clases.interfaces.ExportarInformacion;
import com.eis.poo.clases.personalv2.Empleado;
import com.eis.poo.clases.personalv2.Estudiante;
import com.eis.poo.clases.personalv2.Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HerenciaInterfaces {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaIngreso = new Date();
        fechaIngreso = formatoFecha.parse("05-04-2015");

        Empleado empleado = new Empleado("Administrador", fechaIngreso, 9500000, 86072521, "JUAN FELIPE", "MORALES DIAZ");
        Estudiante estudiante=new Estudiante(1111,"ANDRES","ROA CASTRO");

        System.out.println("Empleado: " + empleado.getNombres() + " " + empleado.getApellidos());
        empleado.exportarDocumentoHTML();
        System.out.printf("informacionDocumento(): " + empleado.informacionDocumento());

        System.out.println("Estudiante: " + estudiante.getNombres() + " " + estudiante.getApellidos());
        estudiante.exportarDocumentoEXCEL();
        System.out.printf("informacionDocumento(): " + estudiante.informacionDocumento());

        System.out.println("****************************Documento****************************");
        exportarDocumentos(empleado);
        System.out.println("****************************Documento****************************");
        exportarDocumentos(estudiante);
    }

    public static void exportarDocumentos(ExportarInformacion documento) {
        documento.exportarDocumentoHTML();
        documento.exportarDocumentoCSV();
        documento.exportarDocumentoEXCEL();
    }
}
