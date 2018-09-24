package com.bcc.chapter03.compose;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 比较器复合
 */
public class CompareCompose {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("aa", "b", "ccccc", "ddd", "f");
        list.sort(Comparator.comparing(String::length));
        System.out.println(list);
        list.sort(Comparator.comparing(String::length).reversed());
        System.out.println(list);
    }
}
