package com.eis.conceptos;

import com.eis.poo.clases.Cuentas.Cuenta;
import com.eis.poo.clases.Cuentas.CuentaAhorros;
import com.eis.poo.clases.Cuentas.CuentaCorriente;

import java.text.ParseException;

public class PolimorfismoAplicacion {

    public static void main(String[] argumentos) throws ParseException {

        CuentaAhorros micuenta1 = new CuentaAhorros(25000, "JOSE ARIAS", "5319803-899",0.0,0.0);
        CuentaCorriente micuenta2 = new CuentaCorriente(45000, "00098999-23", 1, 100,
                                                        "SANDRA MILENA PALACIOS", "0012383-001", 0.0, 0.0);
        CuentaAhorros micuenta3 = new CuentaAhorros(55000, "RICARDO ANDRES CASTRO LEAL", "5319803-899",0.0,0.0);

        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Cliente-->" + micuenta1.getCliente());
        System.out.println("Numero de cuenta-->" + micuenta1.getNumerocuenta());
        System.out.println("Cuota de mantenimiento-->" + micuenta1.getCuotamantenimiento());
        System.out.println("Saldo inicial-->" + micuenta1.getSaldo());
        System.out.println("Adicionar dinero --> 100000");
        micuenta1.setSaldo(100000);
        System.out.println("Saldo actual-->" + micuenta1.getSaldo());
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Cliente-->" + micuenta2.getCliente());
        System.out.println("Numero de cuenta-->" + micuenta2.getNumerocuenta());
        System.out.println("Cuota de mantenimiento-->" + micuenta2.getCuotaMantenimiento());
        System.out.println("Chequera-->" + micuenta2.getChequera());
        System.out.println("Cheque inicial-->" + micuenta2.getNumeracionInicial());
        System.out.println("Cheque final-->" + micuenta2.getNumeracionFinal());
        System.out.println("Saldo inicial-->" + micuenta2.getSaldo());
        System.out.println("Adicionar dinero --> 5000000");
        micuenta2.setSaldo(5000000);
        System.out.println("Saldo actual-->" + micuenta2.getSaldo());
        System.out.println("---------------------------------------------------------------------------------------------------");


        Cuenta[]listadoCuentas=new Cuenta[3];

        listadoCuentas[0]=micuenta1;
        listadoCuentas[1]=micuenta2;
        listadoCuentas[2]=micuenta3;

        System.out.println("---------------------------------------------------------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("Cliente-->" + listadoCuentas[i].getCliente() + " Saldo-->" + listadoCuentas[i].getSaldo());
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
        for (Cuenta cuenta : listadoCuentas) {

            System.out.println("Cliente-->" + cuenta.getCliente() + " Saldo-->" + cuenta.getSaldo());
        }
        System.out.println("---------------------------------------------------------------------------------------------------");

        for (Cuenta cuenta : listadoCuentas) {
            if (cuenta instanceof CuentaAhorros)
                System.out.println("Tipo de objeto:CuentaAhorros -  Cliente-->" +
                        cuenta.getCliente() + " Saldo-->" + cuenta.getSaldo());
            else if ( cuenta instanceof CuentaCorriente) {
                System.out.println("Tipo de objeto:CuentaCorriente -  Cliente-->" + cuenta.getCliente()
                        + " Saldo-->" + cuenta.getSaldo());
            }
            else
                System.out.println("Tipo de objeto:Cuenta -  Cliente-->" + cuenta.getCliente()
                        + " Saldo-->" + cuenta.getSaldo());
        }
    }
}
