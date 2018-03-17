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
    public void after(){
        System.out.println("Tests are finished.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> myList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.examinate((ArrayList<Integer>) myList);
        //Then
        Assert.assertEquals(0, resultList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When

        //Then
        Assert.assertEquals();
    }
}

//testOddNumbersExterminatorNormalList (sprawdzi czy klasa zachowuje się poprawnie gdy
// lista zawiera liczby parzyste i nieparzyste)
// - czy napisac jeden test do tego, czy dwa.
// - jesli jeden to czy ma byc bez podzialu?
