package com.bcc.chapter06;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeTest {


    public static void main(String[] args) {

        List<Integer> integers = partitionPrimes(100);
        System.out.println(integers);

    }

    private static boolean isPrime(int num) {
        int sqrt = (int) Math.sqrt(num);
        return IntStream.rangeClosed(2, sqrt).noneMatch(i -> num % i == 0);
    }

    private static List<Integer> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n)
                .boxed()
                .filter(PrimeTest::isPrime).collect(Collectors.toList());
    }

}
