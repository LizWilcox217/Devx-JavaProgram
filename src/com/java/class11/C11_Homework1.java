package com.java.class11;

import java.util.Scanner;

public class C11_Homework1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number you would like to see table of");

        int num = sc.nextInt();

        int i = 1;

        while (i <= 10) {
            System.out.println(num * i);
            i++;

        }
    }
}
