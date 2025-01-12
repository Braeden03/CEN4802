public class Fibonacci {
    /**
     * Calculates the nth term of the Fibonacci sequence recursively.
     *
     * @param n the term number to calculate
     * @return the nth term of the Fibonacci sequence
     */
    public static int calculateFibonacci(int n) {
        if (n <= 1) return n; // Base case
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2); // Recursive case
    }
}
