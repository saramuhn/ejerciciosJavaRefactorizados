package com.company;

import java.util.Scanner;

public class Vocal {
    Scanner sc = new Scanner(System.in);
    public static final String FRASE = "La sonrisa sera la mejor arma contra la tristeza";

    public void cambiarVocales() {
        String frase = "";
        char[] frasePorCaracter = FRASE.toCharArray();
        for (int i = 0; i < frasePorCaracter.length; i++) {
            if (frasePorCaracter[i] == 'a') {
                frasePorCaracter[i] = 'e';
            }
        }
        for (int i = 0; i < frasePorCaracter.length; i++) {
            frase += frasePorCaracter[i];
        }
        concatenarFrases(frase);
    }

    public void concatenarFrases(String fraseInicial) {
        String fraseFinal = "";
        System.out.print("Ingrese frase: ");
        fraseFinal = sc.nextLine();
        fraseFinal = fraseInicial + " " + fraseFinal;
        System.out.print("La frase concatenada es: " + fraseFinal);
    }
}
