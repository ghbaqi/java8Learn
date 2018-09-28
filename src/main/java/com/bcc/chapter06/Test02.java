package com.bcc.chapter06;

import com.bcc.chapter04.base.Dish;
import com.bcc.chapter04.base.MenusUtil;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

/**
 * 汇总
 * 预定义收集器
 * Collectors.  summingInt  averagingDouble  summarizingInt  joining
 */
public class Test02 {


    public static void main(String[] args) {

        Integer sum = MenusUtil.menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("sum = " + sum);

        Double average = MenusUtil.menu.stream().collect(Collectors.averagingDouble(Dish::getCalories));
        System.out.println("ave = " + average);

        IntSummaryStatistics intSummaryStatistics = MenusUtil.menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println(intSummaryStatistics);

        String names = MenusUtil.menu.stream().map(Dish::getName).collect(Collectors.joining(" ,"));
        System.out.println(names);
    }
}
