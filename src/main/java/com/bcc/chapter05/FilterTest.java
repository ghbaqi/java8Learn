package com.bcc.chapter05;

import java.util.Arrays;
import java.util.List;

public class FilterTest {

    public static void main(String[] args) {

        // 谓词筛选
//        List<Dish> list = MenusUtil.menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
//        System.out.println(list);


        // 去重
        List<Integer> list = Arrays.asList(1, 2, 7, 1, 2, 9, 0, 0, 7, 4);
        list.stream().distinct().forEach(System.out::println);
    }
}
