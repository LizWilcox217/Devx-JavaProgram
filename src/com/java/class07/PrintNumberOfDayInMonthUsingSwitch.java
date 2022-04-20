package com.java.class07;

import java.util.Scanner;

public class PrintNumberOfDayInMonthUsingSwitch {
    // Take month name from user and print number of days in given month

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month 0-12");
        String month = sc.nextLine();

        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31");
                break;
            case "February":
                System.out.println("28/29");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30");
                break;

            default:
                System.out.println("Please enter month name");
        }
    }
}