package com.java.class15;
import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
        System.out.println("Enter your full name");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();

        String parts[] = fullName.split(" ");
        String first = parts[0];
        String midd = parts[1];
        String last = parts[2];
        System.out.println(first.charAt(0) + "." + midd.charAt(0) + "." + last.charAt(0) + ".");


    }
}
