package com.bcc.chapter8;

import com.bcc.chapter04.base.Dish;
import com.bcc.chapter04.base.MenusUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 方法引用
 * 使用 stream api 处理集合
 */
public class Test02 {

    public static void main(String[] args) {

        Map<String, List<Dish>> map01 = MenusUtil.menu.stream()
                .collect(Collectors.groupingBy(Dish::getCategoryLevel));
        System.out.println(map01);

        Integer sum = MenusUtil.menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("sum = "+sum);


        List<String> names = MenusUtil.menu.parallelStream().filter(dish -> dish.getCalories() > 500)
                .map(Dish::getName).collect(Collectors.toList());
        System.out.println(names);
    }

}
