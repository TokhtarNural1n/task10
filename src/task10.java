/**
 * Calculates the greatest common divisor (GCD) of two integers using recursion.
 * @param a The first integer.
 * @param b The second integer.
 * @return The GCD of a and b.
 * If b is 0, GCD(a, b) = a
 * GCD(a, b) = GCD(b, a % b)
 * Calculate the GCD of a and b
 * Output the result
 */

import java.util.Scanner;

public class GCDRecursive {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcdResult = gcd(a, b);

        System.out.println(gcdResult);

        scanner.close();
    }
}

