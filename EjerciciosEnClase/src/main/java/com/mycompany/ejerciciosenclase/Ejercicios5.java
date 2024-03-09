/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosenclase;

/**
 *
 * @author USUARIO
 */
public class Ejercicios5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int cantidadPares = 0;
        int sumaPares = 0;

        System.out.println("Números pares:");

        for (int i = 0; i < 10; i++) {
            int num = numeros[i];
            if (num % 2 == 0) {
                System.out.println(num);
                cantidadPares++;
                sumaPares += num;
            }
        }

        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Suma de los números pares: " + sumaPares);
    }
    
}

    
    

