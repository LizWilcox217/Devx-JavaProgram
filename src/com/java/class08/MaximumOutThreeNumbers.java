package com.java.class08;

import java.util.Scanner;

public class MaximumOutThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select 3 numbers and program will print the greatest");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();

        if(num1>num2 && num1>num3) {
            System.out.println(num1 + "is greatest");
        }  else if( num2>num3) {
            System.out.println(num2 + "is greater");
        }  else  {
            System.out.println(num3 + "is greater");

        }

    }

}
