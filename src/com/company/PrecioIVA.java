package com.company;

import java.util.Scanner;

public class PrecioIVA {
    public static final double IVA=1.21;
    Scanner sc = new Scanner(System.in);

    public void ingresarPrecio(){
        double precioProducto;
        System.out.print("Ingrese precio del producto: ");
        precioProducto=sc.nextDouble();
        calcularPrecioProducto(precioProducto);
    }

    public void calcularPrecioProducto(double precioProducto){
        double precioTotalProducto;
        precioTotalProducto=precioProducto*IVA;
        System.out.println("El precio final del producto es: "+precioTotalProducto);
    }
}
