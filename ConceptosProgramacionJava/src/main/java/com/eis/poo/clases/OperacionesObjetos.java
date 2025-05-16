package com.eis.poo.clases;

public class OperacionesObjetos {
    private final int valor;
    private final String nombre;
    private final Punto punto;

    public OperacionesObjetos() {
        this.valor = 0;
        this.nombre = "MiNombre";
        this.punto = new Punto();

//        this.valor = 0;
//        this.nombre = "MiNombre";
//        this.punto = new Punto();
    }

    public void cambiarDatos(Punto p){
        System.out.println("Valores al llegar punto al Método ");
        System.out.println("Referencia del objeto punto " + p.toString() );
        System.out.println("Valores de punto: " + p.getValorEnX() + " , " + p.getValorEnY() );
        p.setValorEnX(1);
        p.setValorEnY(1);
    }
    public void cambiarDatos(int x){

        System.out.println("Valores al llegar x al Método ");
        System.out.println("Valores de x: " + x );
        Punto p = new Punto(x,x);
    }

    public double calcularPromedio(double [] datos){
        return 0;
    }
    public double calcularPromedio(Punto x, Punto y){
        return 0;
    }

    public String[] imprimirDatos(){
        String[] a =new String[10];
        return a;
    }
    public String[] imprimirDatos(double id){
        String[] a =new String[10];
        return a;
    }

}

