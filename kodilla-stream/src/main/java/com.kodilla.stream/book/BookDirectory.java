package com.kodilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public class BookDirectory {
    private final List<Book> theBookList = new ArrayList<>();

    public BookDirectory() {
        theBookList.add(new Book("Wolf of the Mountains", "Dylan Murphy", 2003, "001"));
        theBookList.add(new Book("Slaves of dreams", "Phoebe Pearson", 2012, "002"));
        theBookList.add(new Book("Obliteration of haven", "Morgan Walsh", 2001, "003"));
        theBookList.add(new Book("Rejecting the night", "Aimee Murphy", 2015, "004"));
        theBookList.add(new Book("Gangsters and kings", "Ryan Talley", 2007, "005"));
        theBookList.add(new Book("Unity without duty", "Madelyn Carson", 2007, "006"));
        theBookList.add(new Book("Enemies of eternity", "Giancarlo Guerrero", 2009, "007"));
    }

        public List<Book> getList() {
            return new ArrayList<>(theBookList);
    }
}
