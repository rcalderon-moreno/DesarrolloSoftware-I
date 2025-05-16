package com.eis.poo.clases.Cuentas;


public class CuentaAhorros extends Cuenta {
    private double cuotamantenimiento;

    public CuentaAhorros(double cuotamantenimiento, String c, String n, double s, double i) {
        super(c, n, s, i);
        this.cuotamantenimiento = cuotamantenimiento;
    }

    public double getCuotamantenimiento() {
        return this.cuotamantenimiento;
    }

    public void setCuotamantenimiento(double cuotamantenimiento) {
        this.cuotamantenimiento = cuotamantenimiento;
    }
}