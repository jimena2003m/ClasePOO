import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Ingrese un caracter (presione espacio para salir):");
            Scanner scanner = new Scanner(System.in);
            String entrada = scanner.nextLine();

            if (entrada.equals(" ")) {
                System.out.println("Programa terminado.");
                break;
            }

            char caracter = entrada.charAt(0);

            if (esVocal(caracter)) {
                System.out.println("VOCAL");

            } else {
                System.out.println("NO VOCAL");
            }
        }
    }

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' && c == 'e' && c == 'i' && c == 'o' && c == 'u';
    }
}