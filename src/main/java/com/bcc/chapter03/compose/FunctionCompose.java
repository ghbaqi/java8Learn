package com.bcc.chapter03.compose;

import java.util.function.Function;

/**
 * 函数复合
 * andThen    compose   可以等价互换 ?
 * f1.andThen(f2)     先 f1  , 再 f2
 *
 *  f1.compose(f2)    先 f2 , 再 f1
 */
public class FunctionCompose {

    public static void main(String[] args) {

        //        Function<Integer, Integer> f1 = a -> a + 1;
        //        Function<Integer, String>  f2 = a -> "value = " + a * 2;
        //        Function<Integer, String> f3 = f1.andThen(f2);
        //
        //        String s1 = f3.apply(4);
        //        System.out.println(s1);

        Function<Integer, Integer> f1 = a -> a + 1;
        Function<Integer, Integer> f2 = a -> a * 2;
        Function<Integer, Integer> f3 = f1.compose(f2);

        Integer s1 = f3.apply(4);   // 5
        System.out.println(s1);

    }

}
