package com.debitsCredits.debitsCredits.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class Main {
    public static int[] pushDebits(int bankQueue[], int newItem)
    {
        int length = bankQueue.length;

        int newBankQueue[] = new int[length + 1];
        int i;
        for (i = 0; i < length; i++)
            newBankQueue[i] = bankQueue[i];

        newBankQueue[length] = newItem;

        System.out.println("\nThe item " + newItem + " was added to the queue: " + Arrays.toString(newBankQueue));
        DebitsCreditsApiApplication.bankDebits = newBankQueue;
        return newBankQueue;
    }

    public static int[] popDebits(int bankQueue[])
    {
        int length = bankQueue.length;

        int newBankQueue[] = new int [length - 1];
        int i;
        for (i = 1; i < length ; i++)
            newBankQueue[i-1] = bankQueue[i];

        System.out.println("\nThe item " + bankQueue[0] + " was removed from the queue: " + Arrays.toString(newBankQueue));
        DebitsCreditsApiApplication.bankDebits = newBankQueue;
        return newBankQueue;
    }

    public static int[] clearDebits(int bankQueue[])
    {
        int newBankQueue[] = new int [0];
        DebitsCreditsApiApplication.bankDebits = newBankQueue;

        System.out.println("\nThe bank queue" + bankQueue + " was cleared: " + Arrays.toString(newBankQueue));

        return newBankQueue;
    }

    public static int sumArray(int[] bankQueue)
    {
        int sum = 0;

        for( int num : bankQueue) {
            sum = sum+num;
        }
        System.out.println("\nThe sum of the array" + bankQueue + " is: " + sum);

        return sum;
    }

    @GetMapping("/push")
    @ResponseBody
    public String getPush(@RequestParam int newItem) {
        pushDebits(DebitsCreditsApiApplication.bankDebits, newItem);
        return "Bank Queue: " + Arrays.toString(DebitsCreditsApiApplication.bankDebits) + "\nItem pushed: " + newItem;
    }

    @GetMapping("/pop")
    @ResponseBody
    public String getPop() {
        int itemRemoved = DebitsCreditsApiApplication.bankDebits[0];
        popDebits(DebitsCreditsApiApplication.bankDebits);
        return "Bank Queue: " + Arrays.toString(DebitsCreditsApiApplication.bankDebits) + "\nItem removed: " + itemRemoved;
    }

    @GetMapping("/clear")
    @ResponseBody
    public String getClear(){
        int [] originalArray =DebitsCreditsApiApplication.bankDebits;
        clearDebits(DebitsCreditsApiApplication.bankDebits);
        return "\nThe bank queue" + Arrays.toString(originalArray) + " was cleared: " + Arrays.toString(DebitsCreditsApiApplication.bankDebits) ;
    }

    public static void main(String[] args)
    {
        sumArray(DebitsCreditsApiApplication.bankDebits);
    }
}

