package com.java.class14;

public class PracticeZoomStrings {

    public static void main(String[] args) {
        String str1 = "we are learning strings";
        String Str2 = str1.replace("learning", "learning about replacement");
        System.out.println(Str2);


        String str3 = ("%s and %s are learning how to format strings");


        System.out.println(String.format(str3, "Liz", "Austin "));

        String str4 = "We have the greatest instructors of all time";
        String str5 = "we have the greatest";
        System.out.println(str4.contains(str5));

        str4 = str4.toLowerCase();
        str5 = str5.toLowerCase();
        System.out.println(str4.contains(str5));
        System.out.println(str4);
        System.out.println(str5.toUpperCase());
        System.out.println(str4.indexOf('i'));
        System.out.println(str4.lastIndexOf('i'));

    }
}
