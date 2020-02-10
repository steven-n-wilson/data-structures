package com.loremIpsum.LoremIpsumAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Main {

    public static StringBuilder histrogram(int count){
        String clean = " ";
        StringBuilder newHistrogram = new StringBuilder(String.valueOf(clean.charAt(0)));
        for(int i= 1; i<= count; i++)
            newHistrogram.append("*").append(clean.charAt(0));
        System.out.println(newHistrogram);
        return newHistrogram;
    }

    public static Serializable countChars(String loremText) {
        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();

        loremText = loremText.toLowerCase();
        loremText = loremText.replaceAll("\\s+","");
        loremText = loremText.replaceAll("\\W","");

        char[] arrLoremText = loremText.toCharArray();

        for (char letter : arrLoremText){
            if( charCountMap.containsKey(letter)){
                charCountMap.put(letter, charCountMap.get(letter) + 1);
            }
            else{
                charCountMap.put(letter, 1);
            }
        }

        for(Map.Entry entry: charCountMap.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            histrogram((Integer) entry.getValue());

        }

        return "Data";
    }

    public static void main(String[] args){
    }

    @GetMapping("/count")
    @ResponseBody
    public String getCount(@RequestParam String loremText) {
        countChars(loremText);
        return "Generated Count: " + countChars(loremText);
    }

}
