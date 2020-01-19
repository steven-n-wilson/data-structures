package com.sumNaturalNums.restAppNaturalNums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class sumTest {

    @Test
    public int sumOfN(int N) {
        int sum;
        sum = (N*(N+1))/2;
        return sum;
    }

    @Test
    void sum() {
        assertEquals(10, sum.sumOfN(4));
        assertEquals(120, sum.sumOfN(15));
        assertEquals(55, sumOfN(10));
    }
}