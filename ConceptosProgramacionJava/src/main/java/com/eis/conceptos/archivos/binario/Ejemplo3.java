/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eis.conceptos.archivos.binario;

import com.eis.poo.clases.personal.Empleado;

import java.io.*;
import java.util.Date;

/**
 *
 * @author roger
 */
public class Ejemplo3 {
    public Ejemplo3() throws IOException {
        File f=new File("objetos.out");
        FileOutputStream fis=new FileOutputStream(f);
        ObjectOutputStream fob=new ObjectOutputStream(fis);
        try{            
            
            for (int i=0;i<10;i++)
            {
                Date ahora = new Date();
                Empleado ob = new Empleado("Administrador", ahora, 2000000,86987222,"JUAN ANDRES","MORALES DIAZ");
                fob.writeObject(ob);
            }
        }
        catch(FileNotFoundException e){e.printStackTrace();}       
        catch(IOException e){e.printStackTrace();}
        finally{fob.close();}
    }
    
   
    public void leerArchivo() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f=new File("objetos.out"); 
        FileInputStream fis=new FileInputStream(f);        
        ObjectInputStream fob = new ObjectInputStream(fis);        
        try{                    
            Object aux;            
            while ((aux =  fob.readObject())!=null)
            {
                if (aux instanceof Empleado)
                {
                    System.out.println(aux);
                    Empleado tempo = (Empleado) aux;
                    System.out.println("Empleado:" + tempo.getIdentificacion());
                }
            }                   
        }
        catch(EOFException e){;}
        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}        
        finally{ fob.close();}    
    }
}
