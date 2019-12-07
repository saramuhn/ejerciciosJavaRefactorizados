package com.company;

public class ParImparFor {
    public int limiteInferior=1;
    public int limiteSuperior=100;

    public void mostrarNumerosPares() {
        int numerosPares[] =new int[limiteSuperior/2];
        int auxiliarContador=0;
        System.out.println("\nLos números pares de " + limiteInferior + " hasta " + limiteSuperior + " son: ");
        for (int i=limiteInferior;i<=limiteSuperior;i++) {
            if (i% 2 == 0) {
                numerosPares[auxiliarContador] = i;
                auxiliarContador++;
            }
        }
        for (int i=0;i<numerosPares.length;i++){
            System.out.print(numerosPares[i] + "\t");
        }
    }

    public void mostrarNumerosImpares() {
        int numerosImpares[] = new int[limiteSuperior/2];
        int auxiliarContador=0;
        System.out.println("Los números impares de " + limiteInferior + " hasta " + limiteSuperior + " son: ");
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (!(i % 2 == 0)) {
                numerosImpares[auxiliarContador] = i;
                auxiliarContador++;
            }
        }
        for (int i = 0; i <numerosImpares.length; i++) {
            System.out.print(numerosImpares[i] + "\t");
        }
    }
}
