package com.example.estructuras_datos_spring.Arrays;

import java.util.Scanner;

public class App {

    String[] apellidos;

    public App() {
        apellidos = new String[5];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        App app = new App();
        int suma = 0;

        app.apellidos[0] = "Torres";
        app.apellidos[1] = "Messi";
        app.apellidos[2] = "Maradona";
        app.apellidos[3] = "Neymar";
        app.apellidos[4] = "Ronaldo";

        // for (int i = 0; i < app.apellidos.length; i++) {
        // System.out.println(app.apellidos[i]);
        // }

        int[] precios = new int[3];

        for (int i = 0; i < precios.length; i++) {
            System.out.println("Ingrese el precio : ");
            precios[i] = sc.nextInt();
        }

        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }

        for (int i = 0; i < precios.length; i++) {
            suma += precios[i];
        }

        System.out.println("la suma de los precio es :"+ suma);
    }
}
