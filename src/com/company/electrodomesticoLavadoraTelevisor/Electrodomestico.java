package com.company.electrodomesticoLavadoraTelevisor;

public class Electrodomestico {
    public double precioBase = 100;
    public String color = "blanco";
    public char consumoEnergetico = 'F';
    public double peso= 5;


    public Electrodomestico() {
        consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        color=comprobarColor("Blanco");
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        color=comprobarColor("Blanco");
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        switch (letra) {
            case 'A':
            case 'a':
                consumoEnergetico = letra;
                break;
            case 'B':
            case 'b':
                consumoEnergetico = letra;
                break;
            case 'C':
            case 'c':
                consumoEnergetico = letra;
                break;
            case 'D':
            case 'd':
                consumoEnergetico = letra;
                break;
            case 'E':
            case 'e':
                consumoEnergetico = letra;
                break;
            case 'F':
            case 'f':
                consumoEnergetico = letra;
                break;
            default:
                consumoEnergetico = 'F';
        }
        return consumoEnergetico;
    }

    private String comprobarColor(String colorIngresado) {

        switch (colorIngresado.toUpperCase()) {
            case "BLANCO":
                color = "Blanco";
                break;
            case "NEGRO":
                color = "Negro";
                break;
            case "ROJO":
                color = "Rojo";
                break;
            case "AZUL":
                color = "Azul";
                break;
            case "GRIS":
                color = "Gris";
                break;
            default:
                color = "Blanco";
        }
        return color;
    }

    public double precioFinal(){
        double precio;
        precio=precioConsumo()+precioPeso();
        return precio;
    }
    public double precioConsumo(){
        double precio;
        switch (consumoEnergetico) {
            case 'A':
            case 'a':
                precio=precioBase+100;
                break;
            case 'B':
            case 'b':
                precio=precioBase+80;
                break;
            case 'C':
            case 'c':
                precio=precioBase+60;
                break;
            case 'D':
            case 'd':
                precio=precioBase+50;
                break;
            case 'E':
            case 'e':
                precio=precioBase+30;
                break;
            case 'F':
            case 'f':
                precio=precioBase+10;
                break;
            default:
                precio=precioBase;

        }
        return precio;
    }

    public double precioPeso(){
        double precio=0;
        if(peso>=0 && peso<=19)
            precio=10;
        if(peso>=20 && peso<=49)
            precio= 50;
        if (peso>=50 && peso<=79)
            precio=80;
        if(peso>=80)
            precio=100;

        return precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
