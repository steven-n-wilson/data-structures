package com.bank.bankAPI;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class Bank {

    public static String itemRemoved(){
        String itemDeleted =  BankApiApplication.bankQueue.get(0);
        return itemDeleted;
    }

    public static ArrayList<String> pop(ArrayList<String> bankQueue) {
        String itemRemoved = bankQueue.get(0);

        bankQueue.remove(0);

        System.out.println("The item " + itemRemoved + " was removed from the array " + bankQueue);

        return bankQueue;

    }

    public static ArrayList<String> push(ArrayList<String> bankQueue, String item) {
        bankQueue.add(item);
        System.out.println("The item " + item + " was added to the array " + bankQueue);
        return bankQueue;

    }

    public static ArrayList<String>  clear(ArrayList<String> bankQueue) {
        bankQueue.clear();
        System.out.println("The array was cleared " + bankQueue);

        return bankQueue;

    }

    @GetMapping("/push")
    @ResponseBody
    public String getPush(@RequestParam String amount) {
        push(BankApiApplication.bankQueue, amount);
        return "Array: " + BankApiApplication.bankQueue + "\nItem pushed: " + amount;
    }

    @GetMapping("/pop")
    @ResponseBody
    public String getPop() {
        String data = itemRemoved();
        pop(BankApiApplication.bankQueue);
        return "Array: " + BankApiApplication.bankQueue + "\nItem removed: " + data ;
    }

    @GetMapping("/clear")
    @ResponseBody
    public String getClear() {
        clear(BankApiApplication.bankQueue);
        return "The array was cleared : " + BankApiApplication.bankQueue;
    }



    public static void main(String[] args){
        ArrayList<String> bankQueue = new ArrayList<>(Arrays.asList("deposit_100", "withdraw_300", "withdraw_243"));
        System.out.println(bankQueue);
        push(bankQueue, "deposit_1654");
        pop(bankQueue);
        clear(bankQueue);
    }


}


