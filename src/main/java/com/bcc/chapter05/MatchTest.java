package com.bcc.chapter05;

import com.bcc.chapter04.base.Dish;
import com.bcc.chapter04.base.MenusUtil;

/**
 * allMatch  anyMatch noneMatch
 */
public class MatchTest {

    public static void main(String[] args) {

        boolean anyMatch = MenusUtil.menu.stream().anyMatch(Dish::isVegetarian);
        System.out.println(anyMatch);

        boolean allMatch = MenusUtil.menu.stream().allMatch(Dish::isVegetarian);
        System.out.println(allMatch);

        boolean b = MenusUtil.menu.stream().noneMatch(Dish::isVegetarian);
        System.out.println(b);
    }
}
