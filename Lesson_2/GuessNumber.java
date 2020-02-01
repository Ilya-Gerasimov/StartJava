import java.util.Scanner;

class GuessNumber {
    private int hiddenNumber = (int)(Math.random() * 100);
    private int playerNumber;
    private Player gamer;

    public void gameNumber(Player gamer) {
        this.gamer = gamer;
        //int hiddenNumber = (int)(Math.random() * 100); тут каждому игроку можно загадывать свое число
        Scanner in = new Scanner(System.in);
        System.out.println("Приглашается игрок " + gamer.getName());

        do {
            System.out.print("Введите Ваше число: ");
            playerNumber = in.nextInt();
            gamer.setNumber(playerNumber);
            if (playerNumber > hiddenNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (playerNumber < hiddenNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали число!");
                System.out.println("Игрок " + gamer.getName() + " закончил игру угадав число " + gamer.getNumber());
            }
        } while(playerNumber != hiddenNumber);
    }
}