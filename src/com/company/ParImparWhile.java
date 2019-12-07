package com.company;

public class ParImparWhile {
    public int limiteInferior=1;
    public int limiteSuperior=100;

    public void mostrarNumerosPares(){
        int numerosPares;
        int auxiliarContador=limiteInferior;
        System.out.println("Los números pares de "+limiteInferior+" hasta "+limiteSuperior+" son: ");
        while (auxiliarContador!=limiteSuperior+1){
            if(auxiliarContador%2==0){
                numerosPares=auxiliarContador;
                System.out.print(numerosPares +"\t");
            }
            auxiliarContador++;
        }
    }
    public void mostrarNumerosImpares(){
        int numerosImpares;
        int auxiliarContador=limiteInferior;
        System.out.println("\nLos números impares de "+limiteInferior+" hasta "+limiteSuperior+" son: ");
        while (auxiliarContador!=limiteSuperior+1){
            if(!(auxiliarContador%2==0)){
                numerosImpares=auxiliarContador;
                System.out.print(numerosImpares +"\t");
            }
            auxiliarContador++;
        }
    }

}
