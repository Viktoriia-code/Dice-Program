package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    private Dice dice;

    @BeforeEach
    void setUp() {
        dice = new Dice();
    }

    @Test
    void roll() {
        dice.roll();
        assertTrue(dice.getDice1() >= 1 && dice.getDice1() <= 6, "Dice 1 is out of range");
        assertTrue(dice.getDice2() >= 1 && dice.getDice2() <= 6, "Dice 2 is out of range");
    }

    @Test
    void getDice1() {
        dice.roll();
        assertTrue(dice.getDice1() >= 1 && dice.getDice1() <= 6, "getDie1() returned out of range value");
    }

    @Test
    void getDice2() {
        dice.roll();
        assertTrue(dice.getDice2() >= 1 && dice.getDice2() <= 6, "getDie2() returned out of range value");
    }

    @Test
    void isDouble() {
        dice.roll();
        if (dice.getDice1() == dice.getDice2()) {
            assertTrue(dice.isDouble(), "Dice 1 and Dice 2 are the same, but isDouble() returned false");
        } else {
            assertFalse(dice.isDouble(), "Dice 1 and Dice 2 are different, but isDouble() returned true");
        }
    }
}