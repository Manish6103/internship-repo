package com.ServiceRegistery;

public class moveSpecialCharacter {
    public static String moveSpecialCharacters(String str){
            StringBuilder sb= new StringBuilder();
            StringBuilder sc =new StringBuilder();

            for(char ch : str.toCharArray()){
                if(Character.isLetter(ch)){
                    sb.append(ch);
                }else if(!Character.isLetter(ch)){
                    sc.append(ch);
                }
            }
            return sb.toString()+sc.toString();
        }

        public static void main(String args[]){
            String str = "He@#$llo!*&";
            System.out.println(moveSpecialCharacters(str));
        }

}

