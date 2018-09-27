package com.bcc.chapter05;

import com.bcc.chapter04.base.Dish;
import com.bcc.chapter04.base.MenusUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkipTest {

    public static void main(String[] args) {

        // limit
        List<Dish> dishes = MenusUtil.menu.stream().filter(d -> d.getCalories() > 300).limit(2).collect(Collectors.toList());
        System.out.println(dishes);


        // skip
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.stream().skip(2L).forEach(System.out::println);
    }
}
