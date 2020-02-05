package com.startjava.lesson_2_3_4.game;

class Player {
    private String name;
    private int number;
    private int count;
    private int[] numbers = new int[20];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setNumber(int number, int count) {
        this.number = number;
        this.count = count;
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
}