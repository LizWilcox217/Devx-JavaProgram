package com.java.class16;

public class FindDivisor {
    public static void main(String[] args) {
        int num = 8;
        for(int i=1; i<=num; i++){
            if(num % i ==0){
                System.out.println(i);
            }
        }
    }
}
