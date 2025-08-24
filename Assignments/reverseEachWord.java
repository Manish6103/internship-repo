package com.ServiceRegistery;

class reverseeachWord {
    public static String reverseEachWord(String str){

        String[] st = str.split(" ");
        StringBuilder sb = new StringBuilder();


        for(String w : st ){
            String reverse= new StringBuilder(w).reverse().toString();
            sb.append(reverse).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String args[]){
        String str = "all cows eat grass";
        System.out.println(reverseEachWord(str));
    }
}
