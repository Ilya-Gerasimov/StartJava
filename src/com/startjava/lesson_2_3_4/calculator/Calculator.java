package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String mathExpression;

    public Calculator(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public int calculate() {
        String[] mathExp = mathExpression.split(" ");

        int firstNumber = Integer.parseInt(mathExp[0]);
        int secondNumber = Integer.parseInt(mathExp[2]);
        char sign = mathExp[1].charAt(0);
        switch (sign) {
            case ('+'):
                return firstNumber + secondNumber;
            case ('-'):
                return firstNumber - secondNumber;
            case ('*'):
                return firstNumber * secondNumber;
            case ('/'):
                return firstNumber / secondNumber;
            case ('%'):
                return firstNumber % secondNumber;
            case ('^'):
                return (int) Math.pow(firstNumber, secondNumber);
        }
        return firstNumber;
    }
}