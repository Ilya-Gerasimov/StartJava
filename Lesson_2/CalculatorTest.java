import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        int firstNumber, secondNumber;
        char sign;
        String answerUser = "yes";
        String answer;

        Scanner in = new Scanner(System.in);
        answer = in.nextLine(); //тут работает
            do {
                System.out.print("Введите первое число: ");
                firstNumber = in.nextInt();
            } while(firstNumber <= 0);

            do {
                System.out.print("Введите знак математической операции: ");
                sign = in.next().charAt(0);
            } while(sign != '+' && sign != '-' && sign != '*'
                    && sign != '/' && sign != '%' && sign != '^');

            do {
                System.out.print("Введите второе число: ");
                secondNumber = in.nextInt();
            } while (secondNumber <= 0);

            Calculator result = new Calculator();
            result.setFirstNumber(firstNumber);
            result.setSecondNumber(secondNumber);
            result.setSign(sign);
            System.out.println("Результат: " + result.result());
            System.out.print("Хотите продолжить? [да/нет]: ");
            answer = in.nextLine();//тут не работает!
    }
}