package com.veterinaria.animales;

public class Perro {
    public String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String historialMedico;
//    private List<String> listaDePerros;

    public Perro(){
//        listaDePerros = new ArrayList<>();
    }

    public Perro(String nombre, String raza, int edad, double peso, String historialMedico) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.historialMedico = historialMedico;
//        listaDePerros = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public void mostrarFichaRegistro(){
        System.out.println(" FICHA DE REGISTRO PACIENTE ");
        System.out.println("Nombre " + nombre);
        System.out.println("Edad " + edad);
        System.out.println("Raza " + raza);
        System.out.println("Peso " + peso);
        System.out.println("Historial medico " + historialMedico );
    }

//    public void agregarPerro(String nombre, String raza, int edad, double peso, String historial){
//        listaDePerros.add(nombre);
//        listaDePerros.add(raza);
//        listaDePerros.add(edad);
//        listaDePerros.add(nombre);
//        listaDePerros.add(nombre);
//    }
}
