package com.java.class06;

import java.util.Scanner;

//Write a program when user enters any number 0-6
//Print days of week
//0-Sunday, 1- Monday, 2- Tuesday...
public class LadderIfElseExample {
    public static void main(String[] args) {
        //Input
        System.out.println("Enter any number 1-6: ");
        Scanner sc = new Scanner(System.in);
        int dayNum = sc.nextInt();

        //Output

        if(dayNum==0){
            System.out.println("Sun");
        }else if(dayNum==1){
            System.out.println("Mon");
        }else if(dayNum==2){
            System.out.println("Tues");
        }else if(dayNum==3){
            System.out.println("Wed");
        }else if(dayNum==4){
            System.out.println("Thurs");
        }else if(dayNum==5){
            System.out.println("Fri");
        }else if(dayNum==6){
            System.out.println("Sat");
        }else{
            System.out.println("Please enter from 0-6 only");
        }

    }
}
