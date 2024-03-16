
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santi
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduzca un numetre entre o y 9.999");
        Scanner teclado = new Scanner(System.in);
        int num =teclado.nextInt();
        if( num >=0&&num<=9999){
         int longi = String.valueOf(num).length();
            System.out.println("el numero "+ num+ " tiene "+longi+" numeros.");
        }else{
        System.out.println("numero tiene mas de 4 dijitos permitidos");
    }
    }
    
}
