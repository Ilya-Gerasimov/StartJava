package com.startjava.Lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        int firstNumber, secondNumber;
        char sign;
        String answerUser;
        Scanner in = new Scanner(System.in);
        Calculator result = new Calculator();

        do {
            do {
                System.out.print("Введите первое число: ");
                firstNumber = in.nextInt();
                //answerUser = in.nextLine();
            } while(firstNumber <= 0);

            result.setFirstNumber(firstNumber);

            do {
                System.out.print("Введите знак математической операции: ");
                sign = in.next().charAt(0);
                //answerUser = in.nextLine();
            } while(sign != '+' && sign != '-' && sign != '*'
                    && sign != '/' && sign != '%' && sign != '^');

            result.setSign(sign);

            do {
                System.out.print("Введите второе число: ");
                secondNumber = in.nextInt();
                //answerUser = in.nextLine();
            } while (secondNumber <= 0);

            result.setSecondNumber(secondNumber);
            System.out.println("Результат: " + result.calculate());
 
            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answerUser = in.next();
            } while(!answerUser.equals("yes") && !answerUser.equals("no"));
        } while (answerUser.equals("yes"));
    }
}