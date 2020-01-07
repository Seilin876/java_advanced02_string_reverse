package com.example.advancedhw02;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        StringBuffer zz = new StringBuffer();
        String t;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入文字");
        System.out.println(zz);
        t = scanner.next();
        zz.append(t);
        zz.reverse();
        System.out.println(zz);
    }
}