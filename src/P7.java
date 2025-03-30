/**
 * this code will reverse the order of number of array,not using arr[],also use recursion.
 */

import java.util.Scanner;
public class P7 {
    public static void ReversePrint(int n, Scanner sc){
        if(n==0) return;
        int num = sc.nextInt();
        ReversePrint(n-1,sc);
        System.out.println(num+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReversePrint(n,sc);
    }
}
