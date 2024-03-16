
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jimena
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("digite su peso =>");
        Scanner teclado = new Scanner(System.in);
        float dato = teclado.nextFloat();
        
        System.out.println("digite su estatuta =>");
        Scanner teclado1 = new Scanner(System.in);
        float dato1 = teclado1.nextFloat();
        
        float estatura= dato1*dato1;
        float imc = dato/estatura;
        
        if (imc<16){
            System.out.println("delgadez severa, su imc es = "+imc);
                
        } else if(imc>=16&&imc<17){
            System.out.println("delgadez moderada, su imc es = "+imc);
            
        }else if(imc>=17&&imc<18.5){
            System.out.println("delgadez leve, su imc es = "+imc);
            
        }else if(imc>=18.5&&imc<25){
            System.out.println("peso normal, su imc es = "+imc);
        }else if(imc>25&&imc<30){
            System.out.println("sobrepeso, su imc es = "+imc);
        }else if(imc>=30&&imc<35){
            System.out.println("obesidad leve, su imc es = "+imc);
            
        }else if(imc>=35&&imc<40){
            System.out.println("obesidad moderada,su imc es = "+imc);
            
        }else{
            System.out.println("obesidad morbida, su ime es = "+imc);
        }
        
    }
  
    
}
