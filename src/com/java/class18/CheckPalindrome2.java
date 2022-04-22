package com.java.class18;

import java.util.Scanner;

public class CheckPalindrome2 {
    public static void main(String[] args) {
        //Take string from user
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //Find Reverse of Given String
        String rev = getReverse(str);

        //Compare Rev with original String to check if Palindrome
        if (str.equals(rev)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

    // This method will find reverse of given String
    static String getReverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}






