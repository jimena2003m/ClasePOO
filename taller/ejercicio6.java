import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        System.out.println("Desea una pizza vegetariana? (si/no):");
        Scanner Scanner = new Scanner(System.in);
        String respuesta = Scanner.nextLine();

        // Verificar la respuesta del usuario y mostrar el menú de ingredientes correspondiente
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Ingredientes disponibles para pizza vegetariana:");
            System.out.println("1. Pimiento");
            System.out.println("2. Tofu");
        } else if (respuesta.equalsIgnoreCase("no")) {
            System.out.println("Ingredientes disponibles para pizza no vegetariana:");
            System.out.println("1. Peperoni");
            System.out.println("2. Jamon");
            System.out.println("3. Salmon");
        } else {
            System.out.println("Respuesta inválida. Por favor, responda sí o no.");
            return;
        }


        System.out.println("Elija un ingrediente (escriba el numero):");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        String ingredienteElegido = "";

        // Determinar el ingrediente elegido y mostrar los ingredientes de la pizza
        if (respuesta.equalsIgnoreCase("si")) {
            switch (opcion) {
                case 1:
                    ingredienteElegido = "Pimiento";
                    break;
                case 2:
                    ingredienteElegido = "Tofu";
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    return;
            }
            System.out.println("Ha elegido una pizza vegetariana con los siguientes ingredientes:");
            System.out.println("- " + ingredienteElegido);
        } else {
            switch (opcion) {
                case 1:
                    ingredienteElegido = "Peperoni";
                    break;
                case 2:
                    ingredienteElegido = "Jamon";
                    break;
                case 3:
                    ingredienteElegido = "Salmon";
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    return;
            }
            System.out.println("Ha elegido una pizza no vegetariana con los siguientes ingredientes:");
            System.out.println("- " + ingredienteElegido);
            System.out.println("gracias por ordenar su pizza en Bella Napoli");
        }
    }
}