package com.ServiceRegistery;

class removeDuplicates {
    public static String removeDuplicatesandSpaces(String str){
        StringBuilder res= new StringBuilder();
        boolean[] seen = new boolean[256];

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' ' && !seen[ch]){
                res.append(ch);
                seen[ch]= true;
            }
        }
        return res.toString();
    }

    public static void main(String args[]){
        String str = "object oriented programming";
        System.out.println(removeDuplicatesandSpaces(str));
    }
}
