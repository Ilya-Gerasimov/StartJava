package com.startjava.lesson_1.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int firstNumber, secondNumber, res = 1;
        char sign;

        Scanner in = new Scanner(System.in); 
        
        do {
            System.out.print("enter the first figure: ");
            firstNumber = in.nextInt();
        } while(firstNumber <= 0);

        do {
            System.out.print("enter a sign + - * / % or ^: ");
            sign = in.next().charAt(0);
        } while(sign != '+' && sign != '-' && sign != '*'
                && sign != '/' && sign != '%' && sign != '^');

        do {
            System.out.print("enter the second figure: ");
            secondNumber = in.nextInt();
        } while (secondNumber <= 0);

        if (sign == '+') {
            res = firstNumber + secondNumber;
        } else if (sign == '-') {
            res = firstNumber - secondNumber;
        } else if (sign == '*') {
            res = firstNumber * secondNumber;
        } else if (sign == '/') {
            res = firstNumber / secondNumber;
        } else if (sign == '%') {
            res = firstNumber % secondNumber;
        } else {
            for (int i = 1; i <= secondNumber; i++) {
                res *= firstNumber;
            }
        }
        System.out.println("Result: " + res);
    }
}