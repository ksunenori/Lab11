/**
 * File: Lab11Prob01.java
 * Class: CSCI 1302
 * Author: Kevin Tran & Thi Tran & Bailey Miller
 * Created on: Dec 1. 2023
 * Last Modified: Dec 1. 2023
 * Description: Display three messages to the console
 */
public class Lab11Prob01 {
    public static void main(String[] args) {
        System.out.println(recursiveAbstract(0));
        System.out.println(recursiveAbstract(1));
        System.out.println(recursiveAbstract(2));
        System.out.println(recursiveAbstract(3));
        System.out.println(recursiveAbstract(4));
        System.out.println(recursiveAbstract(5));
    }

    public static int recursiveAbstract(int n) {
        if (n == 0) { //base case
            return 1;
        } else if (n == 1) { //base case
            return 3;
        } else if (n == 2) { //base case
            return 4;
        } else {
            return (recursiveAbstract(n-3) * (recursiveAbstract(n-2) - recursiveAbstract(n-1))); //general case
        }
    }
}
