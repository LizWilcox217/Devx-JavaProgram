package com.java.class11;

import java.util.Scanner;

public class C11_Homework3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number to see which numbers up to that number are divisible by 7 and not 3");

        int i = 1;
        int num = sc.nextInt();
        while (i <= num) {
            if (i % 3 != 0 && i % 7 == 0) {

                System.out.println(i);
            }
            i++;

        }
    }
}
