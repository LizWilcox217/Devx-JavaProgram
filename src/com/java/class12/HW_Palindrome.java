package com.java.class12;

import java.util.Scanner;

public class HW_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check if it is a Palindrome:  ");
        String st1 = sc.nextLine().toLowerCase();
        String rev = "";

        for (int i = st1.length() - 1; i >= 0; i--) {
            rev = rev + st1.substring (i, i+1);
        }
        System.out.println(rev);
        if (st1.equals(rev)) {
            System.out.println(st1 + "is a palindrome.");
        } else {
            System.out.println(st1 + "is not a palindrome.");
        }
    }
}
