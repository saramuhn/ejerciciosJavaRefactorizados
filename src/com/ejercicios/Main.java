package com.ejercicios;
import java.util.Scanner;


public class Main {

    private static EjercicioSeleccion eleccion=new EjercicioSeleccion();

    public static void main(String[] args) {
        int opcionMenu=obtenerOpcionMenu();
        eleccion.seleccionEjercicio(opcionMenu);
    }





}
