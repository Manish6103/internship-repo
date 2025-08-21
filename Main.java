package com.ServiceRegistery;

public class Main {
    static void number(String num){
        char[] arr = num.toCharArray();

        System.out.println( num.toString());
    }

   static void number1(int n1){
        if(n1%1==0  && n1%n1==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
}

    public static void main(String[] args) {
//        number("Manish");
        number1(16);
    }
}