import java.util.Scanner;

public class GuessNumber {
    private int hiddenNumber = (int)(Math.random() * 100);
    private int playerNumber;
    private Player gamer;

    public GuessNumber (Player gamer) {
        this.gamer = gamer;
    }

    public void gameNumber() {
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Приглашается игрок " + gamer.getName());
            System.out.print("Введите Ваше число: ");
            playerNumber = in.nextInt();
            if (playerNumber > hiddenNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (playerNumber < hiddenNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали число!");
                gamer.setNumber(playerNumber);
            }
        } while(playerNumber != hiddenNumber);
    }
}