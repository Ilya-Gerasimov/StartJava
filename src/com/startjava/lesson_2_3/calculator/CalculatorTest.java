package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите математическое выражение: ");
        String mathExpression = in.nextLine();
        Calculator result = new Calculator(mathExpression);
        String answerUser;
        do {
            System.out.println("Результат: " + result.calculate());

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answerUser = in.next();
            } while(!answerUser.equals("yes") && !answerUser.equals("no"));
        } while (answerUser.equals("yes"));
    }
}