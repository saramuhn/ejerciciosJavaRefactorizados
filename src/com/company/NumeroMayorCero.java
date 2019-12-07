package com.company;

import java.util.Scanner;

public class NumeroMayorCero {
    Scanner sc = new Scanner(System.in);
    public void comprobarNumero(){
        int numero;
        do{
            System.out.print("Ingrese número: ");
            numero= sc.nextInt();
            if (numero>=0) {
                System.out.println("Número mayor o igual a cero: " + numero);
                break;
            }
        }while(numero!=0);
    }

}
