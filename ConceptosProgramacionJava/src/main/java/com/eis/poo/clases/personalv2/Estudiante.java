package com.eis.poo.clases.personalv2;


import java.util.Date;

public class Estudiante extends Persona {
        private double codigo;
        private String programa;

        public Estudiante(double codigo, String programa) {
            this.codigo = codigo;
            this.programa = programa;
        }
        public Estudiante(double identificacion, String nombres, String apellidos) {
            super(identificacion, nombres, apellidos);
        }
        public Estudiante(double codigo, String programa, double identificacion, String nombres, String apellidos) {
            super(identificacion, nombres, apellidos);
            this.codigo = codigo;
            this.programa = programa;
        }


        @Override
        public void exportarDocumentoHTML() {
            System.out.println("Exportando documento HTML desde el estudiante");
        }

        @Override
        public void exportarDocumentoCSV() {
            System.out.println("Exportando documento CSV desde el estudiante");
        }

        @Override
        public void exportarDocumentoEXCEL() {
            System.out.println("Exportando documento EXCEL desde el estudiante");
        }

        @Override
        public String informacionDocumento() {
            return this.informacionPersona();
        }



        public double getCodigo() {
            return this.codigo;
        }
        public void setCodigo(int codigo) {
            this.codigo = (double)codigo;
        }
        public String getPrograma() {
            return this.programa;
        }
        public void setPrograma(String programa) {
            this.programa = programa;
        }
    }


