package com.java.class16;

//Write program to take one String from user and print
//occurence of given char in String
import java.util.Scanner;

public class FindOccuranceOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();

        char c = 'a';
       int count = 0;
       for(int i=0; i<str.length();i++){
           if(str.charAt(i)== c){
                count++;
           }
       }
        System.out.println(count);

    }
}
