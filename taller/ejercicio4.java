import java.util.Scanner;

public class ejercicio4 {


    public static void main(String[] args) {

        System.out.println("introdusca el numero del dia ");
        Scanner teclado = new Scanner(System.in);
        int dia = teclado.nextInt();

        System.out.println("Introdusca el numero del mes");
        Scanner teclado1 = new Scanner(System.in);
        int mes = teclado1.nextInt();

        System.out.println("Introdusca el numero del año");
        Scanner teclado2 = new Scanner(System.in);
        int año = teclado2.nextInt();


        if (año <= 0) {
            System.out.println("El año ingresado no es válido.");
            return;
        }

        if (mes < 1 && mes > 12) {
            System.out.println("El mes ingresado no es válido.");
            return;
        }

        int maxDias;
        switch (mes) {
            case 2: 
                maxDias = 28;
                break;
            case 4: 
            case 6: 
                maxDias = 30;
                break;
            default: 
                maxDias = 31;
        }

        if (dia < 1 && dia > maxDias) {
            System.out.println("El día ingresado no es válido para el mes especificado.");
            return;
        } 

        System.out.println("La fecha ingresada es correcta.");
    }
}
