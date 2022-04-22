package com.java.class18;

public class PrintNumbersDivby5 {
    public static void main(String[] args) {
        //Write a program to print all numbers from 1 to 50 which has more than 5 divisor

                for (int i = 1; i <= 50; i++) {
                    if (fivePlusDiv(i) == true) {
                        System.out.println(i);
                    }

                }
            }

            static boolean fivePlusDiv(int num) {

                    int count = 0;
                    int div;


                for(i =1; i >=num; i++) {
                    if (i % 5 == 0) {
                        count++;
                    }
                }
                if (count >= 6) {
                    return true;
                } else {
                }
                return false;
            }
        }
