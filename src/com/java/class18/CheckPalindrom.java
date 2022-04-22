package com.java.class18;
import java.util.Scanner;
public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a word: ");
        String str1 = sc.nextLine();
        isPalindrome(str1);
    }
       static void isPalindrome(String str1){
        String rev = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            rev = rev + str1.charAt(i);
        }

        if (rev.equals(str1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}




