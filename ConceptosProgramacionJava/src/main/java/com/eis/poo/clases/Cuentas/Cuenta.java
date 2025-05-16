package com.eis.poo.clases.Cuentas;

public class Cuenta {
    private String cliente;
    private String numerocuenta;
    private double saldo;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(String c, String n, double s, double i) {
        this.cliente = c;
        this.numerocuenta = n;
        this.saldo = s;
        this.interes = i;
    }

    public void abonar(double valor, String concepto) {
        this.saldo += valor;
    }

    public void deducir(double valor, String concepto) {
        this.saldo -= valor;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getInteres() {
        return this.interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getNumerocuenta() {
        return this.numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
