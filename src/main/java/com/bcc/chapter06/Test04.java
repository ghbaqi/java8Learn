package com.bcc.chapter06;

import com.bcc.chapter04.base.Dish;
import com.bcc.chapter04.base.MenusUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 多级分组
 */
public class Test04 {


    public static void main(String[] args) {

        Map<Dish.Type, Map<String, List<Dish>>> map01 = MenusUtil.menu.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.groupingBy(dish -> {
                    if (dish.getCalories() > 450)
                        return "HIGH";
                    else
                        return "LOW";
                })));
        System.out.println(map01);

    }
}
