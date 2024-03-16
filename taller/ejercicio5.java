
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Ingrese su edad");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        System.out.println("Digite la suma de sus ingresos mensuales en euros");
        int ingresos = teclado.nextInt();

        int tributo = ingresos/100;
        int resultado = tributo*19;

        if (edad<16) {
            System.out.println("querido usuario su edad es de "+edad+" por lo tanto no debe tributar");

        } else if (ingresos<1000) {
            System.out.println("querido usuario sus ingresos mensuales no son suficientes para tributar");

        } else {
            System.out.println("querido usuario usted es apto para triutar la suma de 19% de su salrio mensual que es "+resultado+"e");
        }
        }



    }