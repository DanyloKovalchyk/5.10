package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 500; i <= 650 ; i=i+10) {
            System.out.println("1)"+i+", ");
        }


        int a = 500;
        while (a<=650){
            System.out.println("2)"+a+", ");
            a += 10;
        }


        int b = 490;
        do{
            b=b+10;
            System.out.println("3)"+b+", ");
        } while(b<650);
    }
}
