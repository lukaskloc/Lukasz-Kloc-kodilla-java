package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieStoreLister {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
            String titlesListed = movieStore.getMovies().entrySet().stream()
                    .flatMap(entry -> entry.getValue().stream())
                    .collect(Collectors.joining(" ! "));
        System.out.println(titlesListed);
    }
}

