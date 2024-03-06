/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Ejercicio1 {
   
// Tablas de multiplicar hasta el 10
    
        public static void main(String[] args) {
    // tablas de multiplicar
    int multiplicador =1;
    int numero =1;
        System.out.println("Ingresar un numero para generar la tabla de multiplicar del 10,s");
         System.out.println("Ingrese el numero");
         
      while (numero <=10){
          System.out.println("  tabla del "+ numero);
         while(multiplicador <=10){
           
         
                 int resultado = multiplicador * numero;
         System.out.println( numero + "X" + multiplicador + "=" + resultado);
       multiplicador++;
         }
         
        
         System.out.println();
         multiplicador =1;
         numero++;
         
      }
      
    }
}
