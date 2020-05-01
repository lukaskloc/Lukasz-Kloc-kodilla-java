package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Stream;


public class MovieStore {
    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslation = new ArrayList<>();
        ironManTranslation.add("Żelazny Człowiek");
        ironManTranslation.add("Iron Man");

        List<String> avengersTranslation = new ArrayList<>();
        avengersTranslation.add("Mściciele");
        avengersTranslation.add("Avengers");

        List<String> flashTranslation = new ArrayList<>();
        flashTranslation.add("Błyskawica");
        flashTranslation.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslation = new HashMap<>();
        booksTitlesWithTranslation.put("IM", ironManTranslation);
        booksTitlesWithTranslation.put("AV", avengersTranslation);
        booksTitlesWithTranslation.put("FL", flashTranslation);

        return booksTitlesWithTranslation;
    }
}


