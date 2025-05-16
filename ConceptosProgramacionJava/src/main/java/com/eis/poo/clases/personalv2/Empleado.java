package com.eis.poo.clases.personalv2;

import java.util.Date;

public class Empleado extends Persona {
    private String cargo;
    private Date fechaIngreso;
    private double salario;

    public Empleado(String c, Date f, double s, double id, String nom, String ape) {
        super(id, nom, ape);
        this.cargo = c;
        this.fechaIngreso = f;
        this.salario = s;
    }


    @Override
    public void exportarDocumentoHTML() {
        System.out.println("Exportando documento HTML desde el empleado");
    }

    @Override
    public void exportarDocumentoCSV() {
        System.out.println("Exportando documento CSV desde el empleado");
    }

    @Override
    public void exportarDocumentoEXCEL() {
        System.out.println("Exportando documento EXCEL desde el empleado");
    }

}

/*

  public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

* */