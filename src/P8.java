/**
 * this code will check if a strings are only consist numbers or not,
 * 1.create a boolean function,using index,to check all the element in the string.
 * 2.let user to input and output the result.
 */

import java.util.Scanner;

public class P8 {
    public static Boolean IsAllNumber(String s,int index){
        if (index == s.length()){
            return true;
        }
        if(!Character.isDigit(s.charAt(index))){
            return false;
        }
        return IsAllNumber(s,index+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        boolean result = IsAllNumber(s,0);
        System.out.println("Is "+ s +" consist of all numbers?"+"Answer:"+result);

    }
}
