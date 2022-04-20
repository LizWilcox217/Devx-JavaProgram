package com.java.class16;
import java.util.Scanner;
public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";

        //String buffer uses the buffer mechanism to protect data from being accessed and updated simultaneously
        //so it is thread safe

        StringBuffer sBuffer = new StringBuffer("Hello");
        sBuffer.reverse();

        //String builder doesn't have buffer mech. so it is faster than StringBuffer
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();
    }
}
