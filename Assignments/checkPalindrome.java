package com.ServiceRegistery;

public class checkPalindrome {
    public static boolean checkPalindrome(String str){
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()) {
            sb.append(ch);
        }
        if(sb.reverse().toString().equals(str) ) {
            return true;
        }else
            return false;
    }

    public static void main(String args[]){
        String str = "radar";
        if(checkPalindrome(str))
            System.out.println("The string is a palindrome!");
        else
            System.out.println("The string is not a palindrome!");
    }
}
