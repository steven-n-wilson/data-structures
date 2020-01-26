package com.bank.bankAPI;


import java.util.ArrayList;
import java.util.Arrays;

public class Bank {

    public static void main(String[] args){
        ArrayList<String> bankQueue = new ArrayList<>(Arrays.asList("deposit_100", "withdraw_300", "withdraw_243"));
        bankQueue.add("deposit_123");
        System.out.println(bankQueue);

        int lastElement = bankQueue.size() - 1;
        bankQueue.remove(lastElement);
        System.out.println(bankQueue);
    }

}


