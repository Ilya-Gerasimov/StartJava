public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private int result = 1;
    private char sign;

    void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
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
                for (int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
                break;
        }
        return result;
    }
}