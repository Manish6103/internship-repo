package com.ServiceRegistery;

import java.util.ArrayList;

public class ascii {
    static int ascii;

    static void sumk(int[] arr){
        int n = arr.length;
        int count=0;
        int i=0;
        int j=1;
                for(int k=2;k<n;k++){
                    if(arr[i]+arr[k] == arr[j]){
                        count++;
                    }
                    i++;
                    j++;
                }
    }

    static void str(String name){
        char[] c = name.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='I')
                break;
            count++;
        }
        System.out.println(count);

    }
    static boolean palindrome(int num){
        String str = Integer.toString(num);
        char[] c = str.toCharArray();
        int left=c[0];
        int right=c[c.length-1];
        while(left<right){
            if(c[left]!=c[right]) return false;
            left++;
            right--;
        }
        return true;
    }
    static boolean prime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0) return false;
        }
        return true;
    }
    static void fibb(int n1,int n2){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=n1;i<=n2;i++){
            if(prime(i)) list.add(i);
        }
        System.out.println(list);
//        return list.toArray();
    }

    
    public static void main(String[] args) {

//        sumk(new int[]{1,2,1,3,4,1,3,2});
//        str("FFFFIFIIF");
//        palindrome(21212);
//     prime(6);
        fibb(2,15);

    }
}
