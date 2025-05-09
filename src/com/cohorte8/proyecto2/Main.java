package com.cohorte8.proyecto2;

import com.cohorte8.proyecto1.Saludador;

public class Main {
    public static void main(String[] args) {
        Saludador saludador = new Saludador();

        saludador.saludar();

        System.out.println(saludador.mensajePublico);
    }

}
