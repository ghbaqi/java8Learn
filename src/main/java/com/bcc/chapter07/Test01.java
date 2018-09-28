package com.bcc.chapter07;

import java.util.stream.Stream;

public class Test01 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Long res = Stream.iterate(1l, i -> i + 1)
                .limit(100000000L)
                .parallel()
                .reduce(0L, Long::sum);
        System.out.println(res);
        long end = System.currentTimeMillis();
        System.out.println("time = " + (end - start));

        // 3022
        // 301
    }
}
