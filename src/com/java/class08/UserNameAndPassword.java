package com.java.class08;

import java.util.Scanner;

public class UserNameAndPassword {

/*Write a program to take username and password from user and print appropriate message
        based on below conditions
        1. If username correct and password correct ---> Login successful
        2. If username correct and password incorrect --> Invalid password
        3. If username incorrect and password correct --> Invalid username
        4. If username incorrect and password incorrect --> Login unsuccessful*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username:");
        String user = sc.nextLine();
        System.out.println("Enter your password:");
        String pass = sc.nextLine();

        if (user.equals ("Student123") && pass.equals ("Pa55word")) {
            System.out.println("Login successful.");
        }else if (user.equals ("Student123")) {
            System.out.println("Invalid password.");
        }else if (pass.equals ("Pa55word")) {
            System.out.println("Invalid username.");
        }else{
            System.out.println("Login unsuccessful. Please check your credentials and try again.");
        }
    }
}
