package com.java.class07;

import java.util.Scanner;

public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price of item to see discount");
        int Value = sc.nextInt();

        if (Value <=100){

            System.out.println("No Discount");

        }else if(Value < 500){
            System.out.println("5%");

        }else if(Value < 1000){
            System.out.println("10%");

        }else if(Value >= 1000){
            System.out.println("15%");
        }
    }
}

