package com.kodilla.stream.iterate;

import java.util.stream.*;

public final class NumbersGenerator {
    public static void generateEven(int max) {
        Stream.iterate(1, n -> n + 1)
                .limit(max) // zawor
                .filter(n -> n % 2 == 0) // f-cja posrednia
                .forEach(System.out::println); // metoda termalna - kolektor
    }
}
