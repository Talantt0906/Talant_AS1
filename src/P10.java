/**
 * this code will find the GCD of two number that user has input,using recursion,have the base case and recursive case.
 */

import java.util.Scanner;

public class P10 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input a: ");
        int a = scanner.nextInt();
        System.out.print("input b: ");
        int b = scanner.nextInt();
        int result = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + result);
    }
}

