package com.bcc.chapter06;

import com.bcc.chapter04.base.Dish;
import com.bcc.chapter04.base.MenusUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 分组
 *
 * Collectors.groupingBy
 *
 */
public class Test03 {

    public static void main(String[] args) {

//        Map<Dish.Type, List<Dish>> map01 = MenusUtil.menu.stream().collect(Collectors.groupingBy(Dish::getType));
//        System.out.println(map01);

        Map<String, List<Dish>> map02 = MenusUtil.menu.stream().collect(Collectors.groupingBy(dish ->
                {
                    if (dish.getCalories() >= 600)
                        return "HIGH";
                    else if (dish.getCalories() >= 400)
                        return "MIDDLE";
                    else
                        return "LOW";
                }
        ));
        System.out.println(map02);


    }
}
