import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {

        System.out.println("ingrese la cantidad de numeros que quiere sumar =>");
        Scanner teclado = new Scanner(System.in); 
        int cantidadnum = teclado.nextInt();

        int dato = 0;

        for (int i = 1; i <= cantidadnum; i++) {
            System.out.println("Ingrese el numero " + i + " => ");
            Scanner teclado1 = new Scanner(System.in);
            int numero = teclado1.nextInt();
            dato += numero ;
        }

        System.out.println("La suma total de los 15 numeros es => "+dato);
    }
}