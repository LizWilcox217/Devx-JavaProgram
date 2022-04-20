package com.java.class09;

public class PrefixAndPostfix {

    public static void main(String[] args) {
        int i = 4;
        int j = 4;
        int k = 4;
        int m = 0;

        i = j++;
        j = k++;
        k = --i;
        m = i + j + k--;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }
}

