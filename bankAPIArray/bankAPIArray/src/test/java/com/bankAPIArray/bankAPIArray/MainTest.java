package com.bankAPIArray.bankAPIArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
//        Test push item to array
        String newItem = "deposit_9.99";
        String array[] = {"withdraw_100", "deposit_99", "deposit_765", "other"};

        System.out.println("Bank Queue:\n" + Arrays.toString(array));

        Main.push(array, newItem);

//        Test to pop item from array
        Main.pop(array);

    }

}