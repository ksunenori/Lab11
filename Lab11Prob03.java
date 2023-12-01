/**
 * File: Lab11Prob03.java
 * Class: CSCI 1302
 * Author: Kevin Tran & Thi Tran & Bailey Miller
 * Created on: Dec 1. 2023
 * Last Modified: Dec 1. 2023
 * Description: Reverse String recursion with helper method
 */
public class Lab11Prob03 {
    public static void main(String[] args) {
        String s = "dog";
        System.out.println(reverseString(s));
    }

    //call to the helper method
    public static String reverseString(String s) {
        return reverseString(s, s.length() - 1);
    }

    //helper method for recursion
    public static String reverseString(String s, int index) {
        if (index == 0) { //base case
            return Character.toString((s.charAt(0)));
        } else {
            return s.charAt(index) + reverseString(s, index - 1); //general case
        }
    }
}
