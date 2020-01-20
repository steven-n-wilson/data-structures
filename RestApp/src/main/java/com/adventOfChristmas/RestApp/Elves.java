package com.adventOfChristmas.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Elves {

    static int calcFuel(int num){
        num = num/3;
        Math.round(num);
        num = num - 2;

        System.out.println("Fuel needed: " + num);
        return num;
    }

    @RequestMapping("/")
    public int index() {
        int answer;
        answer = calcFuel(12);
        return answer;
    }
}
