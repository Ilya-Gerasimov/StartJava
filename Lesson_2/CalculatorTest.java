import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        int firstNumber, secondNumber;
        char sign;
        String answerUser;
        Scanner in = new Scanner(System.in);

        do {
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
            Scanner in1 = new Scanner(System.in); //пришлось задать новый объект in1, поскольку in в этом месте не работал?

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answerUser = in1.nextLine();
            } while(!answerUser.equals("yes") && !answerUser.equals("no"));

        } while (answerUser.equals("yes"));
    }
}