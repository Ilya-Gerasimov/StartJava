package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

class Player {
    private String name;
    private int number;
    private int countAttempts = -1;
    private int[] numbers = new int[5];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setNumber(int number) {
        this.number = number;
        countAttempts++;
        numbers[countAttempts] = number;
    }

    public int getNumber() {
        return number;
    }

    public int getCount() {
        return countAttempts;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, (countAttempts + 1));
    }

    void clear() {
        Arrays.fill(numbers, 0, (countAttempts + 1), 0);
        countAttempts = -1;
    }
}