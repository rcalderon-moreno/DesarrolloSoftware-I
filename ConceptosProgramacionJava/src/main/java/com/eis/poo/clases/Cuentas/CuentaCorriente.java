package com.eis.poo.clases.Cuentas;

public class CuentaCorriente extends Cuenta {
    private double cuotaMantenimiento;
    private String chequera;
    private int numeracionInicial;
    private int numeracionFinal;

    public CuentaCorriente(double cuotaMantenimiento, String chequera, int numeracionInicial, int numeracionFinal, String c, String n, double s, double i) {
        super(c, n, s, i);
        this.cuotaMantenimiento = cuotaMantenimiento;
        this.chequera = chequera;
        this.numeracionInicial = numeracionInicial;
        this.numeracionFinal = numeracionFinal;
    }

    public String getChequera() {
        return this.chequera;
    }

    public void setChequera(String chequera) {
        this.chequera = chequera;
    }

    public double getCuotaMantenimiento() {
        return this.cuotaMantenimiento;
    }

    public void setCuotaMantenimiento(double cuotaMantenimiento) {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public int getNumeracionFinal() {
        return this.numeracionFinal;
    }

    public void setNumeracionFinal(int numeracionFinal) {
        this.numeracionFinal = numeracionFinal;
    }

    public int getNumeracionInicial() {
        return this.numeracionInicial;
    }

    public void setNumeracionInicial(int numeracionInicial) {
        this.numeracionInicial = numeracionInicial;
    }
}

