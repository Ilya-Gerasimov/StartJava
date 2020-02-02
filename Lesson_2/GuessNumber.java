import java.util.Scanner;

class GuessNumber {
    private int hiddenNumber = (int)(Math.random() * 100);
    private int gamerNumber;
    private int choiceGamer = 1;
    private Player gamer1;
    private Player gamer2;
    private Player gamer;

    public void gameNumber(Player gamer1, Player gamer2) {
        this.gamer1 = gamer1;
        this.gamer2 = gamer2;
        Scanner in = new Scanner(System.in);

        do {

            if(choiceGamer == 1) {
                gamer = gamer1;
                choiceGamer = 2;
            } else {
                gamer = gamer2;
                choiceGamer = 1;
            }

            System.out.print(gamer.getName() + ", введите Ваше число: ");
            gamerNumber = in.nextInt();
            gamer.setNumber(gamerNumber);
            if (gamerNumber > hiddenNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (gamerNumber < hiddenNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали число!");
                System.out.println("Игрок " + gamer.getName() + " закончил игру угадав число " + gamer.getNumber());
            }
        } while(gamerNumber != hiddenNumber);
    }
}