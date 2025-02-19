package org.example;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int timesRolled = 0;

        do {
            System.out.println("Rolling the dice...");
            dice.roll();
            timesRolled++;
            System.out.println("Die 1: " + dice.getDice1());
            System.out.println("Die 2: " + dice.getDice2());
            if (dice.isDouble()) {
                System.out.println("You rolled a double!");
            } else {
                System.out.println("Try again.");
            }
        } while (!dice.isDouble());

        System.out.println("After " + timesRolled + " tries both reached the same value");
    }
}