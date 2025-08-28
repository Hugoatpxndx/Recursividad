public class Recursion {

    /**
     * Función factorial de manera recursiva.
     * @param n valor a obtener factorial
     * @return factorial de n
     */
    public static long factorial(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Función de Fibonacci de manera recursiva.
     * @param n la posición del número fibonacci a buscar
     * @return el número de fibonacci en la posición n
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("La secuencia de Fibonacci no está definida para números negativos.");
        }
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static long sumarDigitos(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("La suma de dígitos solo se aplica a números positivos.");
        }
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumarDigitos(n / 10);
        }
    }
    public static String InvertirCadena(String cadena) {
        if (cadena.isEmpty()) {
            return "";
        } else {
            return InvertirCadena(cadena.substring(1)) + cadena.charAt(0);
        }
    }

    public static String contarVocales(String cadena) {
        int cantidad = contarVocalesRecursivo(cadena.toLowerCase(), 0);
        return "La cadena '" + cadena + "' tiene " + cantidad + " vocales";
    }

    private static int contarVocalesRecursivo(String cadena, int index) {
        if (index >= cadena.length()) {
            return 0;
        }

        char caracter = cadena.charAt(index);
        int contador = 0;

        if (caracter == 'a' || caracter == 'e' || caracter == 'i' ||
                caracter == 'o' || caracter == 'u' || caracter == 'á' ||
                caracter == 'é' || caracter == 'í' || caracter == 'ó' ||
                caracter == 'ú' || caracter == 'ü') {
            contador = 1;
        }
        return contador + contarVocalesRecursivo(cadena, index + 1);
    }
}