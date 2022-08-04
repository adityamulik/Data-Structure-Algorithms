package com.searchTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.search.MaxRepetitionsInArray;

public class MaxRepetitionsInArrayTest {
    
    @Test
    public void testMaxRepetition() {
        int[] arr = {1,2,2,2,3,3,4,5};
        MaxRepetitionsInArray maxVal = new MaxRepetitionsInArray(arr);
        assertEquals(2, maxVal.maxRepetition());
    }
}
