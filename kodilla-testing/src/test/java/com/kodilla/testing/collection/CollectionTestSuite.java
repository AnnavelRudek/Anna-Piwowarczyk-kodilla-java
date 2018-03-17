package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Example test start: ");
    }

    @After
    public void after() {
        System.out.println("Test is finished.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> myList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.examinate(myList);
        //Then
        Assert.assertEquals(0, resultList.size());
        System.out.println("List is empty. Test ok.");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(4);
        myList.add(6);
        myList.add(8);
        myList.add(10);

        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(7);
        //When
        List<Integer> resultList = oddNumbersExterminator.examinate(myList);
        //Then
        Assert.assertEquals(5, resultList.size());
        System.out.println("Full list - Test, ok. Number of even numbers: " + resultList.size());
    }
}