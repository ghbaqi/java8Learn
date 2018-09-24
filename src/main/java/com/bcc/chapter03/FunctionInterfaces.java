package com.bcc.chapter03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterfaces {

    public static void main(String[] args) {

        /**
         * predicate 接口
         */
//        List<String> strings = Arrays.asList("", "a", "b", "c", null);
//        System.out.println(strings);
//        List<String> strings1 = strings.stream().filter(a -> a!=null&&a.length()>0).collect(Collectors.toList());
//        System.out.println(strings1);


        /**
         * consumer 接口
         */
//        List<String> strings = Arrays.asList("", "a", "b", "c", null);
//        strings.stream().forEach(System.out::println);


        /**
         * function
         */
        List<String> strings = Arrays.asList("", "a", "b", "c", null);
        Function<String, String> transfer = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s+"11111";
            }
        };
        List<String> list = strings.stream().map(transfer).collect(Collectors.toList());
        System.out.println(list);
    }
}
