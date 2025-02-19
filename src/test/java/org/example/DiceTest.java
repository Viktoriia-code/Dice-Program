package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    private Dice dice;

    @BeforeEach
    void setUp() {
        dice = new Dice();
        dice.roll();
    }

    @Test
    void roll() {
        assertTrue(dice.getDice1() >= 1 && dice.getDice1() <= 6, "Dice 1 is out of range");
        assertTrue(dice.getDice2() >= 1 && dice.getDice2() <= 6, "Dice 2 is out of range");
    }

    @Test
    void getDice1() {
        assertTrue(dice.getDice1() >= 1 && dice.getDice1() <= 6, "getDie1() returned out of range value");
    }

    @Test
    void getDice2() {
        assertTrue(dice.getDice2() >= 1 && dice.getDice2() <= 6, "getDie2() returned out of range value");
    }

    @Test
    void isDouble() {
        while (!dice.isDouble()) {
            dice.roll();
        }
        assertTrue(dice.isDouble(), "Dice should be double");
    }
}