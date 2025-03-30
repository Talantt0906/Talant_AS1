/**
 * This code will find a number is prime number or not.
 * 1.create a (Boolean)function calls isPrime, number below 2 are not prime number,so that return false.
 *using for loop to find the number is prime or not.
 * 2.import scanner allow user input,using if , else to run the function, if function is ture,
 * output is a prime number,false output not a prime number.
 */

import java.util.Scanner;
public class P3 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ：");
        int n = scanner.nextInt();
        scanner.close();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number！");
        } else {
            System.out.println(n + " is not a prime number！");
        }
    }
}

