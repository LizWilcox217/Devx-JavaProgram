package com.java.class16;

// Write a program to take one String from user and print reverse on it
import java.util.Scanner;
public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string of your choice");
        String str = sc.nextLine();


        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }




    }

}
