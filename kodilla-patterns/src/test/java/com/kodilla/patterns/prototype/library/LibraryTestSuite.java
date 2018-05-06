package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("First Library");
        Book book1 = new Book("Wolf of the Mountains", "Dylan Murphy", LocalDate.of(2003, 1, 1));
        Book book2 = new Book("Slaves of dreams", "Phoebe Pearson", LocalDate.of(2012, 1, 1));
        Book book3 = new Book("Obliteration of haven", "Morgan Walsh", LocalDate.of(2001, 1, 1));
        Book book4 = new Book("Rejecting the night", "Aimee Murphy", LocalDate.of(2015, 1, 1));
        Book book5 = new Book("Gangsters and kings", "Ryan Talley", LocalDate.of(2007, 1, 1));
        Book book6 = new Book("Unity without duty", "Madelyn Carson", LocalDate.of(2007, 1, 1));
        Book book7 = new Book("Enemies of eternity", "Giancarlo Guerrero", LocalDate.of(2009, 1, 1));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);
        library.getBooks().add(book7);

        //shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Second Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Third Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(6, library.getBooks().size());
        Assert.assertEquals(6, clonedLibrary.getBooks().size());
        Assert.assertEquals(7, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}