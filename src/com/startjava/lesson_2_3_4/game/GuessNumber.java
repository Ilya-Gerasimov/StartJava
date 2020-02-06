package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumber {
    private Player gamer1;
    private Player gamer2;
    private Player currentPlayer;
    private static int currentNumber;
    private static int hiddenNumber;

    public GuessNumber(Player gamer1, Player gamer2) {
        this.gamer1 = gamer1;
        this.gamer2 = gamer2;
    }

    public void start() {
        hiddenNumber = (int) (Math.random() * 101);
        currentPlayer = gamer1;
        System.out.println("У Вас 10 попыток!");
        do {
            enterNumber();
            checkNumber();
            currentPlayer = (currentPlayer == gamer1) ? gamer2 : gamer1;
        } while (currentNumber != hiddenNumber && (gamer1.getCount() < 4 || gamer2.getCount() < 4));
        printNumbers(gamer1);
        printNumbers(gamer2);
        gamer1.clear();
        gamer2.clear();
    }

    private void printNumbers(Player gamer) {
        int[] numbers = new int[5];
        numbers = Arrays.copyOf(gamer.getNumbers(), (gamer.getCount() + 1));
        System.out.println("Введённые числа игрока " + gamer.getName());
        for (int i = 0; i <= gamer.getCount(); i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    private void enterNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print(currentPlayer.getName() + ", введите Ваше число: ");
        currentNumber = in.nextInt();
        currentPlayer.setNumber(currentNumber);
    }

    private void checkNumber() {
        if (currentNumber > hiddenNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else if (currentNumber < hiddenNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else {
            System.out.println("Вы угадали число!");
            System.out.println("Игрок " + currentPlayer.getName() + " закончил игру угадав число " + currentPlayer.getNumber() +
                    " с " + (currentPlayer.getCount() + 1) + " попытки");
        }
        if (currentPlayer.getCount() == 4) {
            System.out.println("У игрока " + currentPlayer.getName() + " закончились попытки");
        }
    }
}