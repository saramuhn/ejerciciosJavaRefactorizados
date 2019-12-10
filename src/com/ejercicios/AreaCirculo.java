package com.ejercicios;

import java.util.Scanner;

public class AreaCirculo {
    private double radioCirculo;
    private double areaCirculo;

    Scanner sc = new Scanner(System.in);
    public AreaCirculo(){
        ingresarRadioCirculo();
        calcularAreaCirculo();
        mostrarAreaCirculo();
    }

    public void ingresarRadioCirculo() {
        System.out.print("Ingrese radio del círculo: ");
        radioCirculo = sc.nextDouble();
    }

    public void calcularAreaCirculo() {
        areaCirculo = (Math.PI * Math.pow(radioCirculo, 2));
    }

    public void mostrarAreaCirculo() {
        System.out.println("El área del círculo es: " + areaCirculo);
    }



}
