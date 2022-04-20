package com.java.class17;

public class PrintPrimeNumberFrom1to50 {
    public static void main(String[] args) {
        int num = 50;
        int count = 0;
        for (int i = 1; i <=num; i++) {
            if (num % i == 0) ;
            {
                System.out.println(i);
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + "Is Prime");
        } else {
            System.out.println(num + "Is not Prime");
        }
    }
}
















