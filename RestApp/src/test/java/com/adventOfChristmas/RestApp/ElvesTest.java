package com.adventOfChristmas.RestApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElvesTest {

    @Test
    void calcFuel() {
    assertEquals(2, Elves.calcFuel(12));
    assertEquals(2,Elves.calcFuel(14));
    assertEquals(650,Elves.calcFuel(1969));
    }
}