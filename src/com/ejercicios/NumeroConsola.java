package com.ejercicios;

import java.util.Scanner;

public class NumeroConsola {

    Scanner sc = new Scanner(System.in);

    public void ingresarNumeros() {
        double numeroUno;
        double numeroDos;
        System.out.print("Ingrese número Uno: ");
        numeroUno = sc.nextDouble();
        System.out.print("Ingrese número Dos: ");
        numeroDos = sc.nextDouble();
        compararNumeros(numeroUno, numeroDos);
    }

    public void compararNumeros(double numeroUno, double numeroDos) {
        if ((numeroUno != numeroDos)) {
            if (numeroUno > numeroDos)
                System.out.println("El número " + numeroUno + " es mayor que " + numeroDos);
            else
                System.out.println("El número " + numeroDos + " es mayor que " + numeroUno);
        } else
            System.out.println("Son iguales");
    }

}
