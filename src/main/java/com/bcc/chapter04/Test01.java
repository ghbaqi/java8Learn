package com.bcc.chapter04;

import com.bcc.chapter04.base.MenusUtil;

import java.util.List;
import java.util.stream.Collectors;

public class Test01 {

    public static void main(String[] args) {
        List<String> list = MenusUtil.menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(dish -> dish.getName() + " : " + dish.getCalories())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
