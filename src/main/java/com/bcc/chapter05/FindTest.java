package com.bcc.chapter05;

import com.bcc.chapter04.base.Dish;
import com.bcc.chapter04.base.MenusUtil;

import java.util.Optional;

/**
 * findAny  findFirst
 * <p>
 * findAny 在并行是限制更少
 */
public class FindTest {

    public static void main(String[] args) {

        Optional<Dish> any = MenusUtil.menu.stream().filter(Dish::isVegetarian).findAny();

        Optional<Dish> first = MenusUtil.menu.stream().filter(Dish::isVegetarian).findFirst();

        System.out.println(any.get());

        System.out.println(first.get());
    }
}
