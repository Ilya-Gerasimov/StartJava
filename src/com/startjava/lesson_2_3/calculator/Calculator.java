package com.startjava.lesson_2_3.calculator;

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
        int result = 1;
        switch (sign) {
            case ('+'):
                result = firstNumber + secondNumber;
                break;
            case ('-'):
                result = firstNumber - secondNumber;
                break;
            case ('*'):
                result = firstNumber * secondNumber;
                break;
            case ('/'):
                result = firstNumber / secondNumber;
                break;
            case ('%'):
                result = firstNumber % secondNumber;
                break;
            case ('^'):
                result = (int) Math.pow(firstNumber, secondNumber);
                break;
        }
        return result;
    }
}