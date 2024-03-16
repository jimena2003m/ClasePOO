import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de numeros a introducir");
        Scanner teclado = new Scanner(System.in);
        int cantidadNumeros = teclado.nextInt();

        int mayor = 0;
        int menor = 0;
        int igual = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            int numero = teclado.nextInt();

            if (numero > 0) {
                mayor++;
            } else if (numero < 0) {
                menor++;
            } else {
                igual++;
            }
        }

        System.out.println("Cantidad de numeros mayores que 0 " + mayor);
        System.out.println("Cantidad de numeros menores que 0 " + menor);
        System.out.println("Cantidad de numeros iguales a 0 " + igual);
    }
}