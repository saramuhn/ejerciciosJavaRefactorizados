package com.company;

import java.util.Scanner;

public class DiaLaboral {
    Scanner sc = new Scanner(System.in);

    public void pedirDiaSemana() {
        String diaSemana;
        System.out.print("Ingrese día de la semana: ");
        diaSemana = sc.nextLine().toUpperCase();
        comprobarDiaLaboral(diaSemana);
    }

    public void comprobarDiaLaboral(String diaSemana) {
        while (true) {
            switch (diaSemana) {
                case "LUNES":
                case "MARTES":
                case "MIERCOLES":
                case "MIÉRCOLES":
                case "JUEVES":
                case "VIERNES":
                    System.out.println("Día laboral");
                    pedirDiaSemana();
                    continue;
                case "SABADO":
                case "SÁBADO":
                case "DOMINGO":
                    System.out.println("Día no laboral");
                    pedirDiaSemana();
                    continue;
                default:
                    break;
            }
        }

    }


}
