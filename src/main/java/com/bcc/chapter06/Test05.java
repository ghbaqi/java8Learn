package com.bcc.chapter06;

import com.bcc.chapter04.base.Dish;
import com.bcc.chapter04.base.MenusUtil;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * 按子组收集数据
 */
public class Test05 {


    public static void main(String[] args) {

        Map<Dish.Type, Long> map01 = MenusUtil.menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
        System.out.println(map01);

        Map<Dish.Type, Integer> map02 = MenusUtil.menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.summingInt(Dish::getCalories)));
        System.out.println(map02);

    }

}
