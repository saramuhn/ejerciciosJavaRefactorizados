package com.ejercicios.persona;

import java.util.Scanner;

public class EjecutableP {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;
        double peso;
        double altura;
        char sexo;
        String primeraPersona;
        String segundaPersona;
        String terceraPersona;
        System.out.print("Ingrese nombre de la primera Persona: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese edad de la primera Persona: ");
        edad = sc.nextInt();
        System.out.print("Ingrese peso de la primera Persona: ");
        peso = sc.nextDouble();
        System.out.print("Ingrese altura de la primera Persona: ");
        altura = sc.nextDouble();
        System.out.print("Ingrese sexo de la primera Persona (M para Mujer y H para Hombre): ");
        sexo = sc.next().charAt(0);

        Persona personaUno = new Persona(nombre, edad, peso, altura, sexo);
        Persona personaDos = new Persona(nombre, edad, sexo);
        Persona personaTres = new Persona();

        System.out.println("\n****Datos primera persona****");
        primeraPersona = personaUno.toString();
        System.out.println(primeraPersona);
        personaUno.calcularPesoIdeal();
        personaUno.esMayor();

        System.out.println("\n****Datos segunda persona****");
        segundaPersona = personaDos.toString();
        System.out.println(segundaPersona);
        personaDos.calcularPesoIdeal();
        personaDos.esMayor();


        System.out.println("\n****Datos tercera persona****");
        personaTres.setNombre("Sara");
        personaTres.setEdad(22);
        personaTres.setAltura(1.60);
        personaTres.setPeso(86.5);
        personaTres.setSEXO('M');
        terceraPersona = personaTres.toString();
        System.out.println(terceraPersona);
        personaTres.calcularPesoIdeal();
        personaTres.esMayor();


    }

}


