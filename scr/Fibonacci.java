public class Fibonacci {

    /**
     * Calculates the nth term of the Fibonacci sequence using recursion.
     * <p>
     * The Fibonacci sequence is defined as:
     * fib(0) = 0, fib(1) = 1, and fib(n) = fib(n - 1) + fib(n - 2) for n >= 2.
     * </p>
     *
     * @param n the index (0 or greater) of the Fibonacci term to compute
     * @return the nth Fibonacci number
     * @throws IllegalArgumentException if n is negative
     */
    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be 0 or greater.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;                // required by assignment
        int result = fib(n);       // do NOT hard-code the answer

        System.out.println(
                "The " + n + "th term of the Fibonacci sequence is: " + result
        );
    }
}
