package com.eis.conceptos.archivos.texto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ejemplo3 {

    public static void main(String[] args) throws IOException {
        List<String> textoLinea = Files.readAllLines(Paths.get("personas.txt"));
        for (String linea : textoLinea) {
            System.out.println(linea);
        }


        Files.write(Paths.get("texto.txt"), "Texto nuevo".getBytes());
    }

}
