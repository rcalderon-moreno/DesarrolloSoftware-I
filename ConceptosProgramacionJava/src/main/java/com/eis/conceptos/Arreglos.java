package com.eis.conceptos;



public class Arreglos {
    public static void main(String[] args) {

        char x=0;
        int contador=0;
        char m[];
        m=new char[65536];//2 exp 16
        double n[][]=new double[3][3];
        String t[][]=new String[4][];

        t[0]=new String[3];
        t[1]=new String[2];
        t[2]=new String[3];
        t[3]=new String[2];

        for(int i=0;i<m.length;i++){
            m[i]=x;
            x++;
        }
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length  ;j++)
                n[i][j]=contador++;
        }

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length  ;j++)
                t[i][j]= "Cadena (" + i +" - "+ j+")";
        }

        // Imprimir información de los arrays
        for(int i=0;i<m.length;i++)
            System.out.print(m[i] + " ");

        for (char c : m)
            System.out.print(c + " ");

        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length  ;j++)
                System.out.print(n[i][j] + " ");
            System.out.print("\n");
        }
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length  ;j++)
                System.out.print(t[i][j] + " ");
            System.out.print("\n");
        }


    }
}


