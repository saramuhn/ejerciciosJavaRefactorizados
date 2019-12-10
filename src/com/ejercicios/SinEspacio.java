package com.ejercicios;

import java.util.Scanner;

public class SinEspacio {
    Scanner sc = new Scanner(System.in);

    public void ingresarFrase(){
        String frase;
        System.out.print("Ingrese frase: ");
        frase=sc.nextLine();
        quitarEspacios(frase);
    }
    public void quitarEspacios(String frase){

        System.out.println(frase.replaceAll("\\s",""));
    }



}
