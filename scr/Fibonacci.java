public class Fibonacci {

    // Recursive static method that returns the nth Fibonacci number.
    // Definition used:
    // fib(0) = 0, fib(1) = 1, fib(n) = fib(n - 1) + fib(n - 2)
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
