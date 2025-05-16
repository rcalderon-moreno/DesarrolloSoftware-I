package com.eis.poo.clases.personal;

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
}