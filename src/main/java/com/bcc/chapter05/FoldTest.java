package com.bcc.chapter05;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * reduce 归约.
 */
public class FoldTest {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        Integer multiply = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiply);

        Optional<Integer> max = numbers.stream().reduce((a, b) -> a > b ? a : b);
        System.out.println("max = " + max.get());

        long count = numbers.stream().count();
        System.out.println("count = "+count);
    }
}
