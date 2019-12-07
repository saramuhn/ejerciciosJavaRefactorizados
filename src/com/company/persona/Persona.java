package com.company.persona;

import java.util.Random;

public class Persona {
    protected String nombre = "";
    protected int edad = 0;
    protected String dni;
    protected double peso = 0;
    protected double altura = 0;
    protected char SEXO = 'H';

    public Persona() {
        dni=generarDNI();
    }

    public Persona(String nombre, int edad, char SEXO) {
        this.nombre = nombre;
        this.edad = edad;
        this.SEXO = SEXO;
        dni=generarDNI();
    }

    public Persona(String nombre, int edad, double peso, double altura, char SEXO) {
        this.nombre = nombre;
        this.edad = edad;
        this.SEXO = SEXO;
        this.peso = peso;
        this.altura = altura;
        this.dni = generarDNI();
    }

    public double calcularImc() {
        double pesoIdeal = (peso / Math.pow(altura, 2));
        if (pesoIdeal < 20)
            pesoIdeal = -1;
        if (pesoIdeal >= 20 && pesoIdeal <= 25)
            pesoIdeal = 0;
        if (pesoIdeal > 25)
            pesoIdeal = 1;

        return pesoIdeal;
    }

    public void calcularPesoIdeal(){
        double pesoIdeal= calcularImc();
        if (pesoIdeal==-1)
            System.out.println("Tiene Bajo de Peso");
        else{
            if (pesoIdeal==1)
                System.out.println("Tiene Sobrepeso");
            else
                System.out.println("Tiene Peso ideal");
        }
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18)
            return true;
        else
            return false;
    }

    public void esMayor(){
        boolean mayor= esMayorDeEdad();
        if(mayor=true)
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");
    }

    private void comprobarSexo(char sexo) {
        if (SEXO == 'M')
            SEXO = 'M';
        else {
            if (SEXO != 'H')
                SEXO = 'H';
        }
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "\tEdad:" + edad +
                "\tDNI:" + dni  +
                "\tPeso:" + peso +
                "\tAltura:" + altura +
                "\tSexo:" + SEXO;
    }

    private String generarDNI() {
        Random r = new Random();
        int dniAleatorio = r.nextInt(90000000) + 10000000;
        String letraDNI;
        letraDNI = Character.toString(generarLetraDNI(dniAleatorio));
        dni= String.valueOf(dniAleatorio)+"-"+letraDNI;
        return dni;
    }

    private char generarLetraDNI(int dni) {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        return caracteres.charAt(resto);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSEXO(char SEXO) {
        this.SEXO = SEXO;
    }

}
