package com.eis.poo.clases.interfaces;


public interface InterfaceVehiculo {

    void conducir();

    default void encender() {
        System.out.println("Vehículo encendido");
    }

    static void apagar() {
        System.out.println("Vehículo apagado");
    }
}


