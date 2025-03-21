/**
 * This PRIMM activity will help you learn more about recursion.
 * Use the guidance in README.md to explore more.
 * @version 1.0
 * @since 2025-03
 * @author
 */


public class Fibonacci {

    public static void main(String [] args) {
        System.out.println("Print out Fibonacci numbers 0 - 20");
        for (int i = 0; i <= 20; i++) {
            System.out.println(fibonacci(i));
        }
    }

    /**
     * Calculates the fibonacci number corresponding to n.
     * A fibonacci number is defined as the sum of the 
     * previous two fibonacci numbers.
     * F(0) -> 0
     * F(1) -> 1
     * F(2) -> 1
     * F(3) -> 2
     * F(4) -> 3
     * @param n The fibonacci number to produce
     * @return The value corresponding to the nth fibonacci number
     */
    public static int fibonacci(int n) {
        return fibonacci(n-1) + fibonacci(n-2);
    }

}