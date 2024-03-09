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
public class Ejercicios6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner (System.in);
        System.out.println("ingrese el numero de la tabla");
        int tabla = teclado.nextInt();
        
        int cont = 0;
        while (cont<=10) { 
            
            System.out.println(tabla+"x"+cont+"="+tabla*cont);
            cont++;
            cont = 0;
        }
        // TODO code application logic here
    }
    
}

    




    

