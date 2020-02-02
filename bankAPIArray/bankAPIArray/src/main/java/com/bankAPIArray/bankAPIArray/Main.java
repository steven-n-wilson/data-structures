package com.bankAPIArray.bankAPIArray;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class Main {

    public static String[] push(String bankQueue[], String newItem)
    {
        int length = bankQueue.length;

        String newBankQueue[] = new String [length + 1];
        int i;
        for (i = 0; i < length; i++)
            newBankQueue[i] = bankQueue[i];

        newBankQueue[length] = newItem;

        System.out.println("\nThe item " + newItem + " was added to the queue: " + Arrays.toString(newBankQueue));
        BankApiArrayApplication.bankQueue = newBankQueue;
        return bankQueue;
    }

    public static String[] pop(String bankQueue[])
    {
        int length = bankQueue.length;

        String newBankQueue[] = new String [length - 1];
        int i;
        for (i = 1; i < length ; i++)
            newBankQueue[i-1] = bankQueue[i];

        System.out.println("\nThe item " + bankQueue[0] + " was removed from the queue: " + Arrays.toString(newBankQueue));
        BankApiArrayApplication.bankQueue = newBankQueue;
        return newBankQueue;
    }

    public static String[] clear (String bankQueue[])
    {
        String newBankQueue[] = new String [0];
        BankApiArrayApplication.bankQueue = newBankQueue;

        System.out.println("\nThe bank queue" + bankQueue + " was cleared: " + Arrays.toString(newBankQueue));

        return newBankQueue;
    }

    @GetMapping("/push")
    @ResponseBody
    public String getPush(@RequestParam String newItem) {
        push(BankApiArrayApplication.bankQueue, newItem);
        return "Bank Queue: " + Arrays.toString(BankApiArrayApplication.bankQueue) + "\nItem pushed: " + newItem;
    }

    @GetMapping("/pop")
    @ResponseBody
    public String getPop() {
        String itemRemoved = BankApiArrayApplication.bankQueue[0];
        pop(BankApiArrayApplication.bankQueue);
        return "Bank Queue: " + Arrays.toString(BankApiArrayApplication.bankQueue) + "\nItem removed: " + itemRemoved;
    }

    @GetMapping("/clear")
    @ResponseBody
    public String getClear(){
        String [] originalArray = BankApiArrayApplication.bankQueue;
        clear(BankApiArrayApplication.bankQueue);
        return "\nThe bank queue" + Arrays.toString(originalArray) + " was cleared: " + Arrays.toString(BankApiArrayApplication.bankQueue) ;
    }

    public static void main(String[] args)
    {
    }
}
