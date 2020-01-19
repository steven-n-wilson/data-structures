package com.sumNaturalNums.restAppNaturalNums;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//        Write an algorithm to find the sum of the first N natural numbers

@RestController
public class sum {

    public static int sumOfN(int N) {
        int sum;
        sum = (N*(N+1))/2;
        System.out.println("Sum of the first "+ N + " natural numbers: " + sum);
        return sum;
    }

    @RequestMapping("/")
    public int index() {
        int answer;
        answer = sumOfN(5);
        return answer;
    }
}
