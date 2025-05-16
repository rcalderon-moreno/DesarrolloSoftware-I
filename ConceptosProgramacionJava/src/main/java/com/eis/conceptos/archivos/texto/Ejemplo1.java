/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eis.conceptos.archivos.texto;

import java.io.*;

/**
 *
 * @author ingsistemas
 */
public class Ejemplo1 {
    public void leerArchivo()
    {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            try {             
                archivo = new File ("archivo.txt");
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);
                // Lectura del fichero
                String linea;
                while((linea=br.readLine())!=null)
                   System.out.println(linea);
            }
            catch(Exception e){e.printStackTrace();}
            finally{             
                try{                    
                   if( null != fr ){   
                      fr.close();     
                   }                  
                }catch (Exception e2){e2.printStackTrace();}
            }
    }
    public void leerArchivoPorCaracter()
    {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {           
                archivo = new File ("archivo.txt");
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);
                // Lectura del fichero
               int valor=fr.read();
               while(valor!=-1){
                   System.out.print((char)valor);
                   valor=fr.read();
               }
               System.out.println("");
            }
            catch(Exception e){e.printStackTrace();}
            finally{           
                    try{                    
                       if( null != fr )  
                          fr.close();                                       
                    }catch (Exception e2){ e2.printStackTrace();}
            }
    }
    public void escribirArchivo()
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("archivo.txt");
            pw = new PrintWriter(fichero);
            for (int i = 0; i < 10; i++)
                pw.println("ID:"+ i);
        } 
        catch (Exception e) {e.printStackTrace();} 
        finally 
        {
           try {          
                if (null != fichero)
                    fichero.close();
               } catch (Exception e2) {e2.printStackTrace();}
        }
    }
   public void escribirArchivoPorCaracter()
    {

        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("archivo.txt",true);
            pw = new PrintWriter(fichero);
            for (int i = 0; i < 10; i++)            
                pw.print("ID:"+ i +";");
        } 
        catch (Exception e) {e.printStackTrace();}
        finally {
               try 
               {          
                if (null != fichero)
                   fichero.close();
               } catch (Exception e2) {e2.printStackTrace();}
        }
    }
}
