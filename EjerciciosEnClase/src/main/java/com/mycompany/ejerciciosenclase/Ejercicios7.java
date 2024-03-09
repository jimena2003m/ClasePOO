/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosenclase;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicios7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion=0;
        Scanner entrada = new Scanner(System.in);
        
        while(opcion!=5){
            System.out.println("********** MENU DE OPCIONES **********");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar"); 
            System.out.println("4. Dividir"); 
            System.out.println("0. Salir");         
            opcion=entrada.nextInt();
            switch(opcion){
                case 1 -> System.out.println("Escogiste sumar");
                case 2 -> System.out.println("Escogiste restar");
                case 3 -> System.out.println("Escogiste Multiplicar");
                case 4 -> System.out.println("Escogiste Dividir");
                case 0 -> System.out.println("Hasta pronto!");                                
            }
        }
     }    
}

    
    

