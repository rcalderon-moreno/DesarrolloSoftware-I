/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eis.conceptos.archivos.binario;

import java.io.*;


public class Ejemplo4 {
public void leerArchivo() throws FileNotFoundException, IOException
    {
        File f=new File("datos.out"); 
        FileInputStream fis=new FileInputStream(f);
        BufferedInputStream dis=new BufferedInputStream(fis);        
        Integer d;
        boolean fin=true;
        try{            
            d=dis.read();
            
            char x;
            while (d!=-1){
                x= (char)d.intValue();
                
                System.out.println("Valor: " + d.toString() + " Caracter: "+x );
                d=dis.read();
                
            }
        }
        catch(EOFException e){ fin=true;}
        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        finally{dis.close();}
    
    }    
}
