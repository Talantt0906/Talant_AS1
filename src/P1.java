/**
 * this method find the min number in  array, functions are: first ask for array size, than ask for elements
 * in array,at last will output the min element in array.
 * 1. I created a function MIN that help to find the min element,by using for loop and if.
 * 2. I imported Scanner to allow user to input,I also used the for loop to let user input the array elements.
 * 3. finally I called the MIN function to finish the code.
 */

import java.util.Scanner;
public class P1 {
    public static int MIN(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = MIN(arr);
        System.out.println("Min number is: " + min);
    }
    }
