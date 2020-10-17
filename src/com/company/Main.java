package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiply(5));
    }

    public static int multiply(int n){
        if(n < 3){
            return n;
        }
        return multiply(n-1) * multiply(n-2);
    }
}
