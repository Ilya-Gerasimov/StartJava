public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private int calc = 1;
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

    public int result() {
        switch (sign) {
            case ('+'):
                calc = firstNumber + secondNumber;
                break;
            case ('-'):
                calc = firstNumber - secondNumber;
                break;
            case ('*'):
                calc = firstNumber * secondNumber;
                break;
            case ('/'):
                calc = firstNumber / secondNumber;
                break;
            case ('%'):
                calc = firstNumber % secondNumber;
                break;
            case ('^'):
                for (int i = 1; i <= secondNumber; i++) {
                    calc *= firstNumber;
                }
                break;
        }
        return calc;
    }
}