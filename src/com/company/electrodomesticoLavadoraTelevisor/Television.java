package com.company.electrodomesticoLavadoraTelevisor;

public class Television extends Electrodomestico {
    public double resolucion=20;
    public boolean sintonizadorTDT=false;

    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double precioFinal(){
        double precio=super.precioFinal();
        if (resolucion>=40)
            precio=precio*1.30;
        if(sintonizadorTDT==true)
            precio=precio+50;

        return precio;
    }
}
