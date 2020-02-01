import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answerUser;
        Scanner in = new Scanner(System.in);
        System.out.print("Первый игрок введите Ваше имя: ");
        String name = in.nextLine();
        Player gamerFirst = new Player(name);
        System.out.print("Второй игрок введите Ваше имя: ");
        name = in.nextLine();
        Player gamerSecond = new Player(name);

        do {
            GuessNumber playFirst = new GuessNumber(gamerFirst);
            playFirst.gameNumber();
            System.out.println("Игрок " + gamerFirst.getName() + " закончил игру угадав число " + gamerFirst.getNumber());
            GuessNumber playSecond = new GuessNumber(gamerSecond);
            playSecond.gameNumber();
            System.out.println("Игрок " + gamerSecond.getName() + " закончил игру угадав число " + gamerSecond.getNumber());

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answerUser = in.nextLine();
            } while(!answerUser.equals("yes") && !answerUser.equals("no"));
        } while (answerUser.equals("yes"));
    }
}