/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        System.out.println("ingrese su edad");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        if( edad >=18){
            System.out.println("seor usuario usred es mayor de edad ");
            
    } else{
            System.out.println("seor usuario es usted menor de edad");
        }
    }
}
