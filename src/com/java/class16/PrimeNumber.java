package com.java.class16;
// Write a program to check if given number is prime or not
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num % i ==0);{
                count++;
            }
        }
        if(count==2) {
            System.out.println("Is Prime");
        }else {
            System.out.println("Is not Prime");
        }
    }
}
