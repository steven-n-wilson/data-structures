package com.bank.bankAPI;


import java.util.ArrayList;
import java.util.Arrays;

public class Bank {

    static void pop(ArrayList<String> bankQueue) {
        String itemRemoved = bankQueue.get(0);

        bankQueue.remove(0);

        System.out.println("The item " + itemRemoved + " was removed from the array " + bankQueue);

    }

    static void push(ArrayList<String> bankQueue, String item) {
        bankQueue.add(item);
        System.out.println("The item " + item + " was added to the array " + bankQueue);

    }

    static void clear(ArrayList<String> bankQueue) {
        bankQueue.clear();
        System.out.println("The array was cleared " + bankQueue);

    }



    public static void main(String[] args){
        ArrayList<String> bankQueue = new ArrayList<>(Arrays.asList("deposit_100", "withdraw_300", "withdraw_243"));
        System.out.println(bankQueue);
        push(bankQueue, "deposit_1654");
        pop(bankQueue);
        clear(bankQueue);
    }


}


