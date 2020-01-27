package com.bank.bankAPI;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void main() {
        ArrayList<String> bankQueue = new ArrayList<>(Arrays.asList("deposit_100", "withdraw_300", "withdraw_243"));
        System.out.println(bankQueue);

        Bank.push(bankQueue, "deposit_1654");
        Bank.pop(bankQueue);
        Bank.clear(bankQueue);
    }
}