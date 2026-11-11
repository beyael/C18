/**
 * Author: Brandon Garcia
 * @author Brandon Garcia, ComputeGCD
 */

import java.util.Scanner;

public class ComputeGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Retrieve two integers from user.
        System.out.print("Enter the first number: ");
        int m = input.nextInt();

        System.out.print("Enter the second number: ");
        int n = input.nextInt();

        // Compute and display the GCD
        int result = gcd(m, n);
        System.out.println("The GCD of " + m + " and " + n + " is " + result);

        input.close();
    }

    /**
     * Recursive method to find the GCD of two numbers.
     *
     * @param m the first integer
     * @param n the second integer
     * @return the greatest common divisor of m and n
     */
    public static int gcd(int m, int n) {
        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }
}