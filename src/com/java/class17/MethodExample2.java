package com.java.class17;
// Write program to check ood/even number 1 to 15
public class MethodExample2 {

               static boolean isEven(int num){
                   if(num %2 == 0) {
                       return true;
                   }else{
                       return false;
                   }

               }

    public static void main(String[] args) {
        for(int i=1; i<=15; i++){
            if(isEven(i)){
                System.out.println(i + " is even");
            }else {
                System.out.println(i + " is odd");
            }


        }
    }
}
