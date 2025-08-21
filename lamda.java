package com.ServiceRegistery;

public class lamda {
    static void even(int n){
        int s = n % 2 == 0 ? 1 : 0;
        System.out.println(s);
    }

    public static void main(String[] args) {
        even(5);
    }
}
