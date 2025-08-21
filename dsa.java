package com.ServiceRegistery;

import java.util.Arrays;

public class dsa {

        public int peakElement(int[] arr) {
            // code here
            if(arr.length == 1){
                return 0;
            }
            if(arr[0] > arr[1]){
                return 0;
            }
            if(arr[arr.length - 1] > arr[arr.length - 2]) return (arr.length - 1);
            int p=0;
            for(int i=0;i<=arr.length-2;i++){
                //  int p;
                if( arr[i + 1] > arr[i] && arr[i +1] > arr[i+2]){
                    p = i+1;
                }
            }
            return p;
        }

    public static void main(String[] args) {
        dsa dsa = new dsa();
        int [] arr = {1,2,4,5,7,8,3};
        dsa.peakElement(arr);
    }
}
