import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {

      //  System.out.println("digite el numero por el cual quiere que sea el cuadrado =>");
      //  Scanner teclado = new Scanner(System.in);
       // int lado = teclado.nextInt();
         int lado = 8;
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 && i == lado - 1 && j == 0 && j == lado - 1) {

                } else {
                   System.out.print(" * ");

                }
            }
            System.out.println();
        }
    }
}