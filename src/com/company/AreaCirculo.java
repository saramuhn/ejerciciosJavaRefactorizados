package com.company;

import java.util.Scanner;

public class AreaCirculo {
    Scanner sc = new Scanner(System.in);
    public void ingresarNumeros(){
        String radioCirculo;
        System.out.print("Ingrese radio del círculo: ");
        radioCirculo = sc.nextLine();
        calcularAreaCirculo(radioCirculo);

    }
    public void calcularAreaCirculo(String radioCirculo){
        Double areaCirculo;
        areaCirculo= (Math.PI*Math.pow(Double.parseDouble(radioCirculo),2));
        System.out.println("El área del círculo es: "+areaCirculo);
    }

}
