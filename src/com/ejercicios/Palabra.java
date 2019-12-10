package com.ejercicios;

import java.util.Scanner;

public class Palabra {
    Scanner sc = new Scanner(System.in);

    public void pedirPalabras() {
        String primeraPalabra;
        String segundaPalabra;
        System.out.print("Ingrese primera palabra: ");
        primeraPalabra = sc.nextLine();
        System.out.print("Ingrese segunda palabra: ");
        segundaPalabra = sc.nextLine();
        compararPalabras(primeraPalabra, segundaPalabra);
    }

    public void compararPalabras(String palabraUno, String palabraDos) {
        char[] palabraUnoSeparadoPorCaracter = palabraUno.toCharArray();
        char[] palabraDosSeparadoPorCaracter = palabraDos.toCharArray();
        int auxiliarTamanio = 0;
        char[] diferencias;
        if (palabraUnoSeparadoPorCaracter.length > palabraDosSeparadoPorCaracter.length)
            auxiliarTamanio = palabraUnoSeparadoPorCaracter.length;
        else
            auxiliarTamanio = palabraDosSeparadoPorCaracter.length;

        diferencias = encontrarDiferencias(palabraUnoSeparadoPorCaracter, palabraDosSeparadoPorCaracter, auxiliarTamanio);
        mostrarDiferencias(diferencias);

    }

    public char[] encontrarDiferencias(char[] palabraUno, char[] palabraDos, int auxiliarTamanio) {
        char[] diferencias = new char[auxiliarTamanio];
        int contadorDiferencias = 0;
        int i;
        for (i = 0; i < auxiliarTamanio; i++) {
            if (i < palabraUno.length && i < palabraDos.length) {
                if (palabraUno[i] != palabraDos[i]) {
                    diferencias[contadorDiferencias] = palabraDos[i];
                    contadorDiferencias++;
                } else {
                    if (palabraUno.length == palabraDos.length)
                        diferencias[contadorDiferencias] = ' ';
                }
            } else
                break;
        }
        if (i < palabraUno.length) {
            for (int j = i; j < palabraUno.length; j++) {
                diferencias[contadorDiferencias] = palabraUno[j];
                contadorDiferencias++;
            }
        } else {
            for (int j = i; j < palabraDos.length; j++) {
                diferencias[contadorDiferencias] = palabraDos[j];
                contadorDiferencias++;
            }
        }
        return diferencias;
    }

    public void mostrarDiferencias(char[] diferencias) {
        int contadorDiferencias = 0;
        System.out.println("Diferencias  ");

        for (int i = 0; i < diferencias.length; i++) {
            if (diferencias[i] != ' ') {
                System.out.print(diferencias[i] + " \t");
                contadorDiferencias++;
            } else {
                if (contadorDiferencias == 0) {
                    System.out.println("Son iguales");
                    break;
                }
            }
        }
    }
}
