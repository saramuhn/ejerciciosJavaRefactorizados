package com.company.electrodomesticoLavadoraTelevisor;

public class Lavadora extends Electrodomestico {
    public double carga= 5;

    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public double precioFinal(){
        double precio=super.precioFinal();
        if(carga>=30)
            precio=precio+50;

        return precio;
    }

}
