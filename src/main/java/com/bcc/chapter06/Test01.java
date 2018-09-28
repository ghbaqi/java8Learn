package com.bcc.chapter06;

import com.bcc.chapter04.base.Dish;
import com.bcc.chapter04.base.MenusUtil;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test01 {

    public static void main(String[] args) {

//        MenusUtil.menu.stream().collect(Collectors.counting());
//        long count = MenusUtil.menu.stream().count();
//        System.out.println("count = "+count);

        Optional<Dish> max = MenusUtil.menu.stream().max(Comparator.comparingInt(Dish::getCalories));
        Optional<Dish> min = MenusUtil.menu.stream().collect(Collectors.minBy((d1, d2) -> d1.getCalories() - d2.getCalories()));
        System.out.println("max = "+max.get());
        System.out.println("min = "+min.get());

    }
}
