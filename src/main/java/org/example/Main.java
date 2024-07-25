package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado = new Scanner(System.in);

        //Declarar variables

        String nombre;


        int precioSimple = 2000;
        int precioDoble =  4000;
        int precioEspecial = 5000;

        int cantidadSimples;
        int cantidadDobles;
        int cantidadEspeciales;

        int totalSimples;
        int totalDobles;
        int totalEspeciales;


        System.out.println("***BIENVENIDO A HELADERIAFROZEN***");

        System.out.println("¿Cual es tu nombre?");
        nombre =  leerTeclado.nextLine();

        System.out.println("¿cuantos helados simples se vendieron? (Valor por helado 2000)");
        cantidadSimples = leerTeclado.nextInt();

        System.out.println("cuantos helados dobles se vendieron? (Valor por helado 4000)");
        cantidadDobles = leerTeclado.nextInt();

        System.out.println("cuantos helado especiales se vendieron (Valor por helado 5000)?");
        cantidadEspeciales = leerTeclado.nextInt();

        totalSimples = cantidadSimples * precioSimple;
        totalDobles = cantidadDobles * precioDoble;
        totalEspeciales = cantidadEspeciales * precioEspecial;

        System.out.println("Apreciado " +nombre+ " el dia de hoy se recaudaron "
                + totalSimples+ " pesos en helados simples, " + totalDobles+ " pesos en helados dobles y "
                + totalEspeciales + " pesos en helados epeciales");

        int recoleccionTotal;

        recoleccionTotal = totalSimples + totalDobles + totalEspeciales;

        System.out.println("En total se recolectaron " +recoleccionTotal+ " pesos");








    }
}