package com.company;

public class Task2 {

    public static void main(String[] args) {
        int a = 2;
        for (int i = 0; i < 5000; i = i + 2 * a - 1) {
            System.out.println(i);
        }
    }
}
