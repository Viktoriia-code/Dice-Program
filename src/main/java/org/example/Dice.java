package org.example;

public class Dice {
    private int dice1;
    private int dice2;

    public Dice() {
        this.dice1 = 0;
        this.dice2 = 0;
    }

    public void roll() {
        this.dice1 = (int) (Math.random() * 6) + 1;
        this.dice2 = (int) (Math.random() * 6) + 1;
    }

    public int getDice1() {
        return this.dice1;
    }

    public int getDice2() {
        return this.dice2;
    }

    public boolean isDouble() {
        return this.dice1 == this.dice2;
    }
}
