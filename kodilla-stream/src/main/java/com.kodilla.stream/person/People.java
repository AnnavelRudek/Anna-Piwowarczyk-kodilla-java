package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public class People {
    public static List<String> getList() {
        final List<String> theList = new ArrayList<>();
        theList.add("John Smith");
        theList.add("Dorothe Newman");
        theList.add("John Walkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Khloe Fry");
        theList.add("Martin Valenzuela");

        return new ArrayList<String>(theList);
    }
}
