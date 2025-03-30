/**
 * this code will calculate the sum of fibonachi series based on user's input
 * 1.created a function calls fibonachi, using recursion to calculate,and including base cases:if(n==0) return0,.etc
 * also have recursive cases;
 * 2.using scanner let user input number,and output the result.
 */

import java.util.Scanner;

public class P5 {
    public static int fibonachi(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonachi(n-1)+fibonachi(n-2);
    }
    public static void main(String[] args) {
        System.out.println("input number for fibonachi:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the result of fibonachi is:"+ fibonachi(n));
    }
}
