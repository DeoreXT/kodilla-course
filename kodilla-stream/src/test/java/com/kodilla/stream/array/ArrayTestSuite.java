package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTestSuite {
    @Test
    public void testArrayOprations() {
        //Given
        final int [] numbers = {1, 2, 3};
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(2.0, result, 0.0);
    }
}
