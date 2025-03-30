/**
 * this code will calculate the NUMBER A power of N by using recursion,including base case and recursive case;
 */

import java.util.Scanner;

public class P6 {
    public static int Power(int a, int n){
        if(n == 0) return 1;
        return a*Power(a,n-1);
    }
    public static void main(String[] args) {
        System.out.println("input a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("input n:");
        int n = sc.nextInt();
        System.out.println("the result of a power of n is:"+ Power(a,n));
    }
}
