package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
   public void testGetAverage() {
        //Given
        int[] numbers = {5, 8, 9, 4, 6, 9, 1};

        //When
        double average = getAverage(numbers);

        //Then
        Assert.assertEquals(6, average, 0);
    }
}
