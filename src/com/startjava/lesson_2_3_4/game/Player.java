package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

class Player {
    private String name;
    private int number;
    private int count = -1;
    private int[] numbers = new int[5];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setNumber(int number) {
        this.number = number;
        count += 1;
        numbers[count] = number;
    }

    public int getNumber() {
        return number;
    }

    public int getCount() {
        return count;
    }

    public int[] getNumbers() {
        return numbers;
    }

    void clearTabNumbers() {
        Arrays.fill(numbers, 0, (count + 1), 0);
        count = -1;
    }
}