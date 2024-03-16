
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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("introduzca la contraseña a guardar");
        Scanner clave = new Scanner(System.in);
        String clave1 = clave.nextLine();
        
        System.out.println("introduzca su contraseña de nuevo");
        Scanner teclado = new Scanner(System.in);
       String confirmacion = teclado.nextLine();
      
        
        if(clave1 == confirmacion){
            System.out.println("la contraseña es correcta");
            
        }else{
            System.out.println("contraseña incorrecta vuelve a intentarlo");
        }
    
    }
}