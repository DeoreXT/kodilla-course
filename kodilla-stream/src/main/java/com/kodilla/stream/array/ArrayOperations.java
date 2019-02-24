package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        Arrays.stream(numbers).forEach(System.out::println);
        //return  Arrays.stream(numbers).average().orElse(Double.NaN);
        return IntStream.range(0, numbers.length).mapToDouble(n -> numbers[n]).average().orElse(Double.NaN);
    }
}
