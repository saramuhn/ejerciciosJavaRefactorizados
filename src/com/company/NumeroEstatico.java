package com.company;

public class NumeroEstatico {
    private static final double NUMERO_UNO = 0;
    private static final double NUMERO_DOS = 0;


    public void compararNumeros() {
        if ((NUMERO_UNO != NUMERO_DOS)) {
            if (NUMERO_UNO > NUMERO_DOS)
                System.out.println("El número " + NUMERO_UNO + " es mayor que " + NUMERO_DOS);
            else
                System.out.println("El número " + NUMERO_DOS + " es mayor que " + NUMERO_UNO);
        } else
            System.out.println("Son iguales");

    }
}
