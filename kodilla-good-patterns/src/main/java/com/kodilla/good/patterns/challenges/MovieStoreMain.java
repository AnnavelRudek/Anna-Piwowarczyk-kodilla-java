package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] args){

        String titlesInOneLine = MovieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining("!"));
                System.out.println(titlesInOneLine);
    }
}
