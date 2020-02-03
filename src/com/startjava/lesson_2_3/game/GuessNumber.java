package com.startjava.lesson_2_3.game;

import java.util.Scanner;

class GuessNumber {
    private Player gamer1;
    private Player gamer2;

    public GuessNumber(Player gamer1, Player gamer2) {
        this.gamer1 = gamer1;
        this.gamer2 = gamer2;
    }

    public void start() {
        int gamerNumber;
        int hiddenNumber = (int)(Math.random() * 101);
        Player currentPlayer = gamer2;

        Scanner in = new Scanner(System.in);

        do {
            currentPlayer = (currentPlayer == gamer2) ? gamer1 : gamer2;
            System.out.print(currentPlayer.getName() + ", введите Ваше число: ");
            gamerNumber = in.nextInt();
            currentPlayer.setNumber(gamerNumber);
            if (gamerNumber > hiddenNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (gamerNumber < hiddenNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали число!");
                System.out.println("Игрок " + currentPlayer.getName() + " закончил игру угадав число " + currentPlayer.getNumber());
            }
        } while(gamerNumber != hiddenNumber);
    }
}