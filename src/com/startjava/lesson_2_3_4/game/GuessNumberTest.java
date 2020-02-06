package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Первый игрок, введите Ваше имя: ");
        Player player1 = new Player(in.nextLine());
        System.out.print("Второй игрок, введите Ваше имя: ");
        Player player2 = new Player(in.nextLine());

        String playerAnswer;
        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                playerAnswer = in.nextLine();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        } while (playerAnswer.equals("yes"));
    }
}