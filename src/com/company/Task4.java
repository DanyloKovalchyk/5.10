package com.company;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(Fact(10));
    }
    public static int Fact (int f){
        if (f==1){
            return 1;
        }
        return f*Fact(f-1);
    }
}
