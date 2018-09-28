package com.bcc.chapter06;

import com.bcc.chapter04.base.Dish;
import com.bcc.chapter04.base.MenusUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 分区
 */
public class Test06 {

    public static void main(String[] args) {

        Map<Boolean, List<Dish>> map01 = MenusUtil.menu.stream().collect(Collectors.partitioningBy(dish -> {
            if (dish.getCalories() > 450)
                return true;
            else
                return false;
        }));
        System.out.println(map01);

    }

}
