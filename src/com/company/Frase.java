package com.company;

import java.util.Scanner;

public class Frase {
    Scanner sc = new Scanner(System.in);

    public void ingresarFrase(){
        String frase;
        System.out.print("Ingrese frase: ");
        frase=sc.nextLine();
        longitudFrase(frase);
    }

    public void longitudFrase(String frase){
        char[] fraseSeparadaPorCaracter = frase.toCharArray();
        int contadorVocalA=0;
        int contadorVocalE=0;
        int contadorVocalI=0;
        int contadorVocalO=0;
        int contadorVocalU=0;
        int contadorSinVocal=0;
        System.out.println("Longitud de la frase: "+fraseSeparadaPorCaracter.length);
        for (int i=0;i<fraseSeparadaPorCaracter.length;i++){
            switch (fraseSeparadaPorCaracter[i]){
                case 'a':
                case 'A':
                    contadorVocalA++;
                    continue;
                case 'e':
                case 'E':
                    contadorVocalE++;
                    continue;
                case 'i':
                case 'I':
                    contadorVocalI++;
                    continue;
                case 'o':
                case 'O':
                    contadorVocalO++;
                    continue;
                case 'u':
                case 'U':
                    contadorVocalU++;
                case ' ':
                    continue;
                default:
                    continue;
            }
        }
        if(contadorVocalA!=0)
            System.out.println("Cantidad de vocales A: " + contadorVocalA);
        if (contadorVocalE!=0)
            System.out.println("Can" +
                    "tidad de vocales E: " + contadorVocalE);
        if (contadorVocalI!=0)
            System.out.println("Cantidad de vocales I: " + contadorVocalI);
        if (contadorVocalO!=0)
            System.out.println("Cantidad de vocales O: " + contadorVocalO);
        if (contadorVocalU!=0)
            System.out.println("Cantidad de vocales U: " + contadorVocalU);
        if (contadorVocalA==0 && contadorVocalE==0 && contadorVocalI==0 && contadorVocalO==0 && contadorVocalU==0)
            System.out.println("No tiene vocales");
    }
}
