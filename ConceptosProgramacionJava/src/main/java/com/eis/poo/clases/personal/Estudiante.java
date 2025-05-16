package com.eis.poo.clases.personal;


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


