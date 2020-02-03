package com.startjava.lesson_1.game;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hiddenNumber = 49, playerNumber;
        do {
            System.out.print("Введите Ваше число: ");
            playerNumber = in.nextInt();
            if (playerNumber > hiddenNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (playerNumber < hiddenNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
        } while(playerNumber != hiddenNumber);
        System.out.println("Вы угадали!");
    }
}