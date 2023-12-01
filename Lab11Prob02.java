/**
 * File: Lab11Prob02.java
 * Class: CSCI 1302
 * Author: Kevin Tran & Thi Tran & Bailey Miller
 * Created on: Dec 1. 2023
 * Last Modified: Dec 1. 2023
 * Description: Reverse String recursion
 */
public class Lab11Prob02 {
    public static void main(String[] args) {
        String s = "dog";
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s) {
        if (s.length() <= 1) { //base case
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0); //general case
        }
    }

}
