package com.java.class16;
//Write a program to take one statement from user and find out number of words
// we have inside statement
import java.util.Scanner;
public class StringPracticeWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter statement");
        String str1 = sc.nextLine();

        String[] parts =str1.split(" ");
        System.out.println(parts.length);



        }
    }

