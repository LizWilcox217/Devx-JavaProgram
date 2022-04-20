package com.java.class13;

import java.util.Scanner;

public class StringExample {

    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        java.lang.String str1 = "Love this";
        java.lang.String str2 = "Hate this";
        java.lang.String str3 = sc.nextLine();

        if (str1 == str2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (str2 == str3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (str1.equals(str3)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
