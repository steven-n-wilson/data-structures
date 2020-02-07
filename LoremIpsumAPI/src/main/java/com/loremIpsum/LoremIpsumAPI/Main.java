package com.loremIpsum.LoremIpsumAPI;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void countChars(String loremText) {
        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();

        loremText = loremText.toLowerCase();

        char[] arrLoremText = loremText.toCharArray();

        for (char letter : arrLoremText){
            if( charCountMap.containsKey(letter)){
                charCountMap.put(letter, charCountMap.get(letter) + 1);
            }
            else{
                charCountMap.put(letter, 1);
            }
        }

        for(Map.Entry entry: charCountMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args){
        String loremText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        countChars(loremText);
    }

}
