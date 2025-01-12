/**
 * The Fibonacci class contains a method to calculate the nth term of the Fibonacci sequence.
 * This is a recursive method that calculates Fibonacci numbers.
 */
public class Fibonacci {

    /**
     * Calculates the nth term in the Fibonacci sequence using recursion.
     *
     * This method accepts an integer n, and returns the nth Fibonacci number.
     * The sequence starts with 0 (F(0) = 0) and 1 (F(1) = 1), and each subsequent
     * number is the sum of the two preceding ones (F(n) = F(n-1) + F(n-2)).
     *
     * @param n the position in the Fibonacci sequence to calculate (non-negative integer).
     * @return the nth term in the Fibonacci sequence (integer value).
     */
    public static int calculateFibonacci(int n) {
        if (n <= 1) return n;
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}

