/**
 * this code will find the binomial cofficent of the numbers that user has input,by using recursion.
 *
 */

import java.util.Scanner;

public class P9 {
    public static int binomial(int n, int k) {
        if(k == 0 || k == n ){
            return 1;
        }
        return binomial(n-1, k-1) + binomial(n-1, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of n:");
        int n = sc.nextInt();
        System.out.println("enter the number of k:");
        int k = sc.nextInt();
        int result = binomial(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + result);
    }
}
