package com.bcc.chapter06;

import com.bcc.chapter04.base.Dish;
import com.bcc.chapter04.base.MenusUtil;

import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 广义的汇总 reduce
 *
 */
public class ReduceTest {

    public static void main(String[] args) {

        Integer sum = MenusUtil.menu.stream().map(Dish::getCalories).reduce(0, (i, j) -> i + j);
        System.out.println("sum  = "+sum);

        Optional<Dish> max = MenusUtil.menu.stream().collect(Collectors.reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));
        System.out.println("max = "+max);

    }
}
