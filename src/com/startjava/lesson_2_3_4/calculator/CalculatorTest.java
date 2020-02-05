package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answerUser;
        do {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = in.nextLine();
            Calculator result = new Calculator(mathExpression);
            System.out.println("Результат: " + result.calculate());

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answerUser = in.nextLine();
            } while(!answerUser.equals("yes") && !answerUser.equals("no"));
        } while (answerUser.equals("yes"));
    }
}