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
        if (n <= 1) { // Caso base
            return 1;
        } else {
            // Caso recursivo
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
        if (n <= 1) { // Caso base
            return n;
        } else {
            // Caso recursivo
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
}