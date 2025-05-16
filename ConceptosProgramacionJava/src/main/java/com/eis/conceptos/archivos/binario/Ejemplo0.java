/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eis.conceptos.archivos.binario;

import java.io.*;

/**
 *
 * @author roger
 */
public class Ejemplo0 {

    public Ejemplo0() throws FileNotFoundException, IOException {
        File origen = new File("origen.txt");
        File destino = new File("destino.txt");
        InputStream in = new FileInputStream(origen);
        OutputStream out = new FileOutputStream(destino);
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
          out.write(buf, 0, len);
        }
        
        in.close();
        out.close();
    }
    
}
