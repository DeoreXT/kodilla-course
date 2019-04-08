package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String [] Args) {
        MovieStore moveStore = new MovieStore();
        for(Map.Entry<String, List<String>> entry: moveStore.getMovies().entrySet()) {
            System.out.print(entry.getValue() + ";");
        }
    }
}