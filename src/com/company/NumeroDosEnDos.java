package com.company;

import java.util.Scanner;

public class NumeroDosEnDos {
    Scanner sc = new Scanner(System.in);
    private static final int LIMITE= 1000;

    public void pedirNumero(){
        int numero;
        System.out.print("Ingrese número: ");
        numero=sc.nextInt();
        imprimirNumeros(numero);
    }
    public void imprimirNumeros(int numero){
        System.out.println("Números ");
        for(int i=numero; i<=LIMITE;i+=2){
            System.out.print(i +"\t");
        }

    }
}
