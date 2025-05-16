/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eis.conceptos.archivos.texto;

import com.eis.poo.clases.personal.Empleado;
import com.eis.poo.clases.personal.Persona;


import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;


public class Ejemplo2 {
        public void leerArchivo(String nombre_archivo)
    {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            try {
                archivo = new File (nombre_archivo);
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null)
                   System.out.println(linea);
            }
            catch(Exception e){e.printStackTrace();}
            finally{
                try{                    
                   if( null != fr )
                      fr.close();                                          
                }catch (Exception e2){e2.printStackTrace();}
            }
    }
    public void escribirArchivo(Persona p)
    {

        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("personas.txt",true);
            pw = new PrintWriter(fichero);
            BigDecimal valor = new BigDecimal(p.getIdentificacion()); 
            pw.println( valor + ";"+ p.getNombres()+";"+p.getApellidos()+";" );
        } 
        catch (Exception e) {e.printStackTrace();}
        finally {
               try {
                     if (null != fichero)
                          fichero.close();
                } catch (Exception e2) {e2.printStackTrace();}
        }
    }
    
    public void escribirArchivo(Empleado p)
    {

        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("empleados.txt");
            pw = new PrintWriter(fichero);
            BigDecimal valor = new BigDecimal(p.getIdentificacion()); 
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");         
            String fechaConFormato = formatoFecha.format(p.getFechaIngreso());  
            pw.println( valor + ";"+ p.getNombres()+";"+p.getApellidos()+";"+p.getCargo()
                        + ";"+fechaConFormato+";" + new BigDecimal(p.getSalario()) );
        } catch (Exception e) {e.printStackTrace();} 
        finally {
               try {
                 if (null != fichero)
                  fichero.close();
                } catch (Exception e2) {e2.printStackTrace();}
        }
    }

}
