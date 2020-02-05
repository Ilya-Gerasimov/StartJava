package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumber {
    private Player gamer1;
    private Player gamer2;

    public GuessNumber(Player gamer1, Player gamer2) {
        this.gamer1 = gamer1;
        this.gamer2 = gamer2;
    }

    public void start() {
        int gamerNumber =0;
        int countGamer = 0;
        int countGamer1 = -1;
        int countGamer2 = -1;
        int hiddenNumber = (int)(Math.random() * 101);
        Player currentPlayer = gamer2;
        int[] a = new int[20];

        Scanner in = new Scanner(System.in);
        System.out.println("У Вас 10 попыток!");
        do {
            if(currentPlayer == gamer2) {
                currentPlayer = gamer1;
                countGamer1 += 1;
                countGamer = countGamer1;
            } else {
                currentPlayer = gamer2;
                countGamer2 += 1;
                countGamer = countGamer2;
            }

            System.out.print(currentPlayer.getName() + ", введите Ваше число: ");
            gamerNumber = in.nextInt();
            currentPlayer.setNumber(gamerNumber, countGamer);
            if (gamerNumber > hiddenNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (gamerNumber < hiddenNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали число!");
                System.out.println("Игрок " + currentPlayer.getName() + " закончил игру угадав число " + currentPlayer.getNumber() +
                        " с " + (currentPlayer.getCount() + 1) + " попытки");
                a = Arrays.copyOf(currentPlayer.getNumbers(), currentPlayer.getCount());
                for(int i = 0; i <= currentPlayer.getCount(); i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        } while(gamerNumber != hiddenNumber);
    }
}