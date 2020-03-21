package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(x -> numbers[x])
                .forEach(System.out::println);
        return IntStream.range(0, numbers.length)
                .map(x -> numbers[x])
                .average()
                .orElse(0);
    }
}
