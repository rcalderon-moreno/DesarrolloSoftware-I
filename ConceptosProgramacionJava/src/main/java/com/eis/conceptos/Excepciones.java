package com.eis.conceptos;

public class Excepciones {
    public static void main(String[] args) {

        try
        {
            int x=0,y=100,z=0;
            z=x+y;
            z=y/0;
            //int j[]=new int [3];
            //j[4]=0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException error)
        { System.out.println(error); }
        catch (RuntimeException error)
        { System.out.println(error); }
        catch (Exception error)
        { System.out.println(error); }
        finally
        {
            System.out.println("Con el bloque finally Java nos garantiza"
                    + " que pase lo que pase, el código pasará por este bloque.");
        }


    }
}
