import java.util.Scanner;

public class Main {

    public static String pedirCadena(Scanner scanner) {
        scanner.nextLine(); // Limpiar el buffer primero
        System.out.print("Ingrese una cadena de texto para invertir: ");
        String cadena = scanner.nextLine();

        if (cadena.trim().isEmpty()) {
            System.out.println("No ingresó nada. Por favor, intente de nuevo.");
            return pedirCadena(scanner); // Llamada recursiva si la cadena está vacía
        } else {
            return cadena; // Caso base: si la cadena no está vacía, la devuelve
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        long number;

        do {
            System.out.println("--- Menú Recursividad ---");
            System.out.println("1. Calcular Factorial");
            System.out.println("2. Calcular Fibonacci");
            System.out.println("3. Sumar dígitos de un número");
            System.out.println("4. Invertir una cadena de texto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Ingresa el número del cual quieres el factorial: ");
                        number = scanner.nextLong();
                        try {
                            System.out.println("El factorial de " + number + " es: " + Recursion.factorial(number));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese la posición en la secuencia que deseas obtener: ");
                        number = scanner.nextLong();
                        try {
                            System.out.println("El número de la secuencia Fibonacci en la posición " + number + " es: " + Recursion.fibonacci(number));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese un número para sumar sus dígitos: ");
                        number = scanner.nextLong();
                        try {
                            System.out.println("La suma de los dígitos de " + number + " es: " + Recursion.sumarDigitos(number));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        String cadena = pedirCadena(scanner);
                        System.out.println("La cadena invertida es: " + Recursion.InvertirCadena(cadena));
                        break;
                    case 5:
                        System.out.println("Saliendo del programa");
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next();
                option = 0;
            }
            System.out.println();
        } while (option != 5);

        scanner.close();
    }
}