package com.example.estructuras_datos_spring.Pilas;

import java.util.Stack;

public class App {
    
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacía " + pila);
        System.out.println("Está vacía "+ pila.isEmpty());


        // aquí se agregan elementos a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        // aquí se recorren los elemntos de la pila
        for (int i = 0; i < pila.size(); i++) {
            System.out.println(pila.get(i));
        }

        // se muestran resultadios de la pila
        System.out.println("pila : "+ pila);
        System.out.println("Está vacía "+ pila.isEmpty());

        pila.pop(); // elimina el ultimo elemento que ingresó a la pila
        System.out.println("Está el número 3 ?" + pila.search(3));
        System.out.println("Ultimo elemento agregado: " + pila.peek());
    }

    
    
}
