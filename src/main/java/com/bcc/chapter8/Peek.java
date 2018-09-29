package com.bcc.chapter8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  peek 在每个流的元素恢复运行之前 , 插入执行一个动作
 */
public class Peek {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> res = list
                .stream()
                .peek(integer -> System.out.println("stream = " + integer))
                .filter(integer -> integer%2==0)
                .peek(integer -> System.out.println("filter = " + integer))
                .limit(2)
                .peek(integer -> System.out.println("limit = " + integer))
                .collect(Collectors.toList());
    }
}
