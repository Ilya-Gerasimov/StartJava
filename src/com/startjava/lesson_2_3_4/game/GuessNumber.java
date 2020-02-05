package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumber {
    private Player gamer1;
    private Player gamer2;
    private static Player currentPlayer;
    private static int countGamer1 = -1;
    private static int countGamer2 = -1;
    private static int countGamer = 0;

    public GuessNumber(Player gamer1, Player gamer2) {
        this.gamer1 = gamer1;
        this.gamer2 = gamer2;
    }

    public void start() {
        int gamerNumber =0;
        currentPlayer = gamer2;
        int hiddenNumber = (int)(Math.random() * 101);
        int counter = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("У Вас 10 попыток!");
        do {
            setGamer();
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
            }
            counter += 1;
            if(counter == 10) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            }
        } while(gamerNumber != hiddenNumber && counter != 10);

        printTab(gamer1);
        printTab(gamer2);

    }

    private void setGamer() {
        if(currentPlayer == gamer1) {
            currentPlayer = gamer2;
            countGamer2 += 1;
            countGamer = countGamer2;
        } else {
            currentPlayer = gamer1;
            countGamer1 += 1;
            countGamer = countGamer1;
        }
    }

    private void printTab(Player gamer) {
        int[] printTab = new int[5];
        printTab = Arrays.copyOf(gamer.getNumbers(), (gamer.getCount()+1));
        System.out.println("Введённые числа игрока " + gamer.getName());
        for(int i = 0; i <= gamer.getCount(); i++) {
            System.out.print(printTab[i] + " ");
        }
        System.out.println();
    }
}