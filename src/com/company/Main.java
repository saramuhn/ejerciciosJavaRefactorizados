package com.company;

import com.company.electrodomesticoLavadoraTelevisor.EjecutableE;
import com.company.persona.EjecutableP;
import com.company.serieVideojuego.EjecutableSV;

import java.util.Scanner;


public class Main {

    private static final int NUMEROS_ESTATICOS = 1;
    private static final int NUMEROS_CONSOLA = 2;
    private static final int AREA_CIRCULO = 3;
    private static final int PRECIO_IVA = 4;
    private static final int PARES_IMPARES_WHILE = 5;
    private static final int PARES_IMPARES_FOR = 6;
    private static final int NUMERO_MAYOR_CERO = 7;
    private static final int DIA_LABORAL= 8;
    private static final int CAMBIAR_VOCALES = 9;
    private static final int ELIMINAR_ESPACIOS = 10;
    private static final int LONGITUD_FRASE_CONCATENAR = 11;
    private static final int PALABRAS_IGUALES = 12;
    private static final int FORMATO_FECHA = 13;
    private static final int NUMERO_DOS_EN_DOS = 14;
    private static final int MENU_REPETIDO = 15;
    private static final int PERSONA = 16;
    private static final int ELECTRODOMESTICO_LAVADORA_TELEVISOR = 17;
    private static final int SERIE_VIDEOJUEGO = 18;
    private static final int SALIR = 0;


    public static void main(String[] args) {
        int opcionMenu=obtenerOpcionMenu();
        seleccionEjercicio(opcionMenu);
    }

    public static void mostrarMenu() {
        System.out.println("******** Ejercicios de JAVA ********");
        System.out.println("1- Comparar números estáticos.");
        System.out.println("2- Comparar números ingresados por consola.");
        System.out.println("3- Calcular área de un círculo.");
        System.out.println("4- Calcular precio final de un producto con IVA.");
        System.out.println("5- Mostrar números pares e impares con bucle While.");
        System.out.println("6- Mostrar números pares e impares con bucle For");
        System.out.println("7- Comprobar número mayor a cero.");
        System.out.println("8- Comprobar día laboral o no.");
        System.out.println("9- Cambiar vocales de una frase y concatenarle otra.");
        System.out.println("10- Eliminar espacios de una frase");
        System.out.println("11- Indicar longitud de frase y cantidad de vocales.");
        System.out.println("12- Indicar si dos palabras ingresadas son iguales y mostrar diferencias.");
        System.out.println("13- Consultar formato de fecha.");
        System.out.println("14- Imprimir números hasta el 1000 con saltos de dos.");
        System.out.println("15- Mostrar menú repetidas veces.");
        System.out.println("16- Validar información de una Persona.");
        System.out.println("17- Crear Electrodomésticos con Lavadoras y Televisores");
        System.out.println("18- Utilizar la información de Series y Videojuegos.");
        System.out.println("0- Para salir");

    }

    public static int obtenerOpcionMenu() {
        Scanner sc = new Scanner(System.in);
        int opcionMenu;
        mostrarMenu();



        opcionMenu = sc.nextInt();
        return opcionMenu;
    }

    public static void seleccionEjercicio(int opcionMenu) {
        do {
            switch (opcionMenu) {
                case NUMEROS_ESTATICOS:
                    NumeroEstatico numeroEstatico = new NumeroEstatico();
                    numeroEstatico.compararNumeros();
                    continue;
                case NUMEROS_CONSOLA:
                    NumeroConsola numeroConsola = new NumeroConsola();
                    numeroConsola.ingresarNumeros();
                    continue;
                case AREA_CIRCULO:
                    AreaCirculo areaCirculo = new AreaCirculo();
                    areaCirculo.ingresarNumeros();
                    continue;
                case PRECIO_IVA:
                    PrecioIVA precioIVA = new PrecioIVA();
                    precioIVA.ingresarPrecio();
                    continue;
                case PARES_IMPARES_WHILE:
                    ParImparWhile paresImparesWhile = new ParImparWhile();
                    paresImparesWhile.mostrarNumerosImpares();
                    paresImparesWhile.mostrarNumerosPares();
                    continue;
                case PARES_IMPARES_FOR:
                    ParImparFor parImparFor = new ParImparFor();
                    parImparFor.mostrarNumerosImpares();
                    parImparFor.mostrarNumerosPares();
                    continue;
                case NUMERO_MAYOR_CERO:
                    NumeroMayorCero numeroMayorCero = new NumeroMayorCero();
                    numeroMayorCero.comprobarNumero();
                    continue;
                case DIA_LABORAL:
                    DiaLaboral diaLaboral = new DiaLaboral();
                    diaLaboral.pedirDiaSemana();
                    continue;
                case CAMBIAR_VOCALES:
                    Vocal vocal = new Vocal();
                    vocal.cambiarVocales();
                    continue;
                case ELIMINAR_ESPACIOS:
                    SinEspacio sinEspacio = new SinEspacio();
                    sinEspacio.ingresarFrase();
                    continue;
                case LONGITUD_FRASE_CONCATENAR:
                    Frase frase = new Frase();
                    frase.ingresarFrase();
                    continue;
                case PALABRAS_IGUALES:
                    Palabra palabra = new Palabra();
                    palabra.pedirPalabras();
                    continue;
                case FORMATO_FECHA:
                    FormatoFecha formatoFecha = new FormatoFecha();
                    formatoFecha.cambiarFormatoFecha();
                    continue;
                case NUMERO_DOS_EN_DOS:
                    NumeroDosEnDos numeroDosEnDos = new NumeroDosEnDos();
                    numeroDosEnDos.pedirNumero();
                    continue;
                case MENU_REPETIDO:
                    MenuRepetido menuRepetido = new MenuRepetido();
                    menuRepetido.validarMenu();
                    continue;
                case PERSONA:
                    EjecutableP persona = new EjecutableP();
                    persona.ejecutar();
                    continue;
                case ELECTRODOMESTICO_LAVADORA_TELEVISOR:
                    EjecutableE electrodomestico = new EjecutableE();
                    electrodomestico.ejecutar();
                    continue;
                case SERIE_VIDEOJUEGO:
                    EjecutableSV dieciocho = new EjecutableSV();
                    dieciocho.ejecutar();
                    continue;
                default:
                    opcionMenu = SALIR;
            }
        }
        while (opcionMenu != SALIR);
    }

}
