package com.bcc.chapter07;

import java.util.stream.LongStream;

public class Test02 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        long res = LongStream.rangeClosed(1, 1000000000L)
                .parallel()
                .reduce(0l, Long::sum);
        System.out.println(res);
        long end = System.currentTimeMillis();
        System.out.println("time = " + (end - start));

        // parallel   85        1612    217  232
        //           116  116   4697    601  586

    }
}
