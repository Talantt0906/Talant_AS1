/**  this code will find the avarage number of array.
 * 1.create a function calls avarage which will first will find the sum of array,than divide to
 * length of array to find avarage number.
 * 2. import scanner allow user to input size of array,using for loop to allow user to input elements in the array
 * 3.call the function avarage to finish code
 *
 */

import java.util.Scanner;

public class P2 {
    public static double Avarage(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        double ava=Avarage(arr);
        System.out.println("Average value of the array: " + ava);


    }
}
