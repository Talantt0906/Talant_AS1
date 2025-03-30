/**
 * this code will find the factorial of number that user has input.
 * 1.create a function calls factorial,using recursion to find the factorial, including base case and recursive case.
 * 2. import scanner to allow user to input number and output it's factorial in the screen.
 */

import java.util.Scanner;

public class P4 {
    public static int factorial(int n){
        if(n<=1) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);

        System.out.println("The factorial of " + n + " is " + result);
    }
}
