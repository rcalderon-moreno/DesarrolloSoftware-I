
package com.eis.poo.clases.personalv2;

import com.eis.poo.clases.interfaces.ExportarInformacion;




public abstract class Persona  implements ExportarInformacion {
    private double identificacion;
    private String nombres;
    private String apellidos;
    private double edad;
    private String direccion;
    private String telefono;
    String email;

    public  Persona() {}
    public  Persona(double identificacion, String nombres, String apellidos) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = -1;
        this.direccion = "---";
        this.telefono = "---";
    }
    public Persona(double identificacion, String nombres, String apellidos,
                   double edad, String direccion, String telefono, String email) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public void exportarDocumentoHTML() {
        System.out.println("Exportando documento HTML");
    }

    @Override
    public void exportarDocumentoCSV() {
        System.out.println("Exportando documento CSV");
    }

    @Override
    public void exportarDocumentoEXCEL() {
        System.out.println("Exportando documento EXCEL");
    }

    @Override
    public String informacionDocumento() {
        return this.informacionPersona();
    }
    public String informacionPersona() {
        return "Persona{" +
                "identificacion=" + identificacion +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public double IdPersona() {
        return identificacion;
    }
    public double getIdentificacion() {
        return identificacion;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return this.nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}


/*
public double IdPersona() {
    return identificacion;
}
public double getIdentificacion() {
    return identificacion;
}
public String getApellidos() {
    return this.apellidos;
}
public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}
public String getNombres() {
    return this.nombres;
}
public void setNombres(String nombres) {
    this.nombres = nombres;
}
*/