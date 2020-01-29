import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hiddenNumber = 49, yourNumber;
        do {
            System.out.print("Введите Ваше число: ");
            yourNumber = in.nextInt();
            if (yourNumber > hiddenNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (yourNumber < hiddenNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
        } while(yourNumber != hiddenNumber);
        System.out.println("Вы угадали!");
    }
}