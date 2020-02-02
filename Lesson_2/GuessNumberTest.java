import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String playerAnswer;
        Scanner in = new Scanner(System.in);
        System.out.print("Первый игрок, введите Ваше имя: ");
        String name = in.nextLine();
        Player player1 = new Player(name);
        System.out.print("Второй игрок, введите Ваше имя: ");
        name = in.nextLine();
        Player player2 = new Player(name);

        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                playerAnswer = in.nextLine();
            } while(!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        } while (playerAnswer.equals("yes"));
    }
}