package com.bcc.chapter02;

import java.util.Arrays;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 0, -1, 8, 2, 5, 7, 9);
        list.sort((a,b)->b-a);
        System.out.println(list);
    }
}
