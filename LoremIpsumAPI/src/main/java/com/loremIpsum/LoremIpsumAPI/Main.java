package com.loremIpsum.LoremIpsumAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.*;

@RestController
public class Main {

    public static ArrayList<String> newArray = new ArrayList<>(Arrays.asList());

    public static StringBuilder histrogram(int count){
        String clean = " ";
        StringBuilder newHistrogram = new StringBuilder(String.valueOf(clean.charAt(0)));
        for(int i= 1; i<= count; i++)
            newHistrogram.append("*").append(clean.charAt(0));
//        System.out.println(newHistrogram);
        return newHistrogram;
    }

    public static ArrayList<String> addX(ArrayList<String> array, String item) {
        array.add(item);
        return array;
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
            Object value = entry.getKey() + ": " + entry.getValue();
            ArrayList<String> data = addX(newArray, value.toString() + histrogram((Integer) entry.getValue()));

            int size = data.size();
            if (size == 10 ){
                System.out.println(data);
                return data;
            }

//            System.out.print(entry.getKey() + ": " + entry.getValue());
//            histrogram((Integer) entry.getValue());
        }
        return "data";
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
