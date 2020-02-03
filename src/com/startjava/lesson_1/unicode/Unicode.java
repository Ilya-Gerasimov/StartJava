package com.startjava.lesson_1.unicode;

public class Unicode {
    public static void main(String[] args) {
        for (int i = 33; i <= 126; i++) {
            System.out.print((char)i);
        }
System.out.println("next");
        for (char i = 33; i <= 126; i++) {
            System.out.print(i);
        }
    }
}