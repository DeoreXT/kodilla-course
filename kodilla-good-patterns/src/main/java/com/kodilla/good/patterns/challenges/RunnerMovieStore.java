package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;

public class RunnerMovieStore {
    public static void main(String [] Args) {
        MovieStore moveStore = new MovieStore();
        Map<String, List<String>> ms = moveStore.getMovies();
        ms.entrySet().stream()
                .map(entry -> entry.getValue())
                .flatMap(entry -> entry.stream())
                .map(entry -> entry + "!")
                .forEach(System.out::print);
    }
}