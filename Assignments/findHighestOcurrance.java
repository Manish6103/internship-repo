package com.ServiceRegistery;

class findhighestOcuurance {

    public static int findHighestOccurrence(String str){
        int[] freq = new int[256];

        for(int i = 0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        int max=0;
        for(int i =0;i<256;i++){
            if(freq[i]> max){
                max = freq[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        String str = "success";
        System.out.println(findHighestOccurrence(str));
    }
}