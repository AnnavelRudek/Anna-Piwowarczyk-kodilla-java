package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Fiodor Dostojewski ", "Zbrodnia i kara", 1866, "1231456"));
        bookSet.add(new Book("Chinua Achebe", "Wszystko rozpada się", 1958, "11223344"));
        bookSet.add(new Book("Hans Christian Andersen", "Baśnie", 1835, "2233555"));
        bookSet.add(new Book("Jane Austen", "Duma i uprzedzenie", 1813, "456789"));
        bookSet.add(new Book("Honoré de Balzac", "Ojciec Goriot", 1835, "6665897"));
        bookSet.add(new Book("Jorge Luis Borges", "Fikcje", 1944, "33669988"));
        bookSet.add(new Book("Paul Celan", "Wiersze", 1952, "87456"));

        //When
        int result = medianAdapter.publicationYearMedian(bookSet);
        System.out.println("Mediana: " + result);

        //Then
        assertEquals(1866, result);


    }
}
