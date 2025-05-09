package com.cohorte8.proyecto1;

public class Saludador {
    //ATRIBUTOS
    public String mensajePublico = "Mensaje publico";
    protected String mensajeProtegido = "Mensaje protegido";
    String mensajePaquete = "Mensaje privado o default";
    private String mensajePrivado = "Mensaje privado";

    // Constructor

    public Saludador(){

    }

    public Saludador(String mensajePublico, String mensajeProtegido, String mensajePaquete, String mensajePrivado) {
        this.mensajePublico = mensajePublico;
        this.mensajeProtegido = mensajeProtegido;
        this.mensajePaquete = mensajePaquete;
        this.mensajePrivado = mensajePrivado;
    }

    public String getMensajeProtegido() {
        return mensajeProtegido;
    }

    public void setMensajeProtegido(String mensajeProtegido) {
        this.mensajeProtegido = mensajeProtegido;
    }

    public String getMensajePaquete() {
        return mensajePaquete;
    }

    public void setMensajePaquete(String mensajePaquete) {
        this.mensajePaquete = mensajePaquete;
    }

    public String getMensajePrivado() {
        return mensajePrivado;
    }

    public void setMensajePrivado(String mensajePrivado) {
        this.mensajePrivado = mensajePrivado;
    }

    public void saludar(){
        System.out.println("Hola desde SALUDADOR");
    }
}
