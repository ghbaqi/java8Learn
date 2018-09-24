package com.bcc.chapter03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1a", "2b", "11cc", "d", "11111a");
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });
//        System.out.println(list);

//        list.sort((a,b)->a.length()-b.length());
//        System.out.println(list);

        list.sort(Comparator.comparing(String::length));
        System.out.println(list);
    }
}
