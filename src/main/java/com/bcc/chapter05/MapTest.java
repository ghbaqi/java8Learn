package com.bcc.chapter05;

import com.bcc.chapter04.base.Dish;
import com.bcc.chapter04.base.MenusUtil;

import java.util.List;
import java.util.stream.Collectors;

public class MapTest {

    public static void main(String[] args) {

        // map
        List<String> names = MenusUtil.menu.stream().map(Dish::getName).collect(Collectors.toList());
        System.out.println(names);
    }
}
