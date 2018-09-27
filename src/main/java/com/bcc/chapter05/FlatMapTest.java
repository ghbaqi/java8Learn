package com.bcc.chapter05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * flatMap 的使用
 * 对集合中每个元素映射后 , 都生成一个集合 . 希望将各个元素的集合合并起来
 * <p>
 * <p>
 * flatMap 与 map 的区别
 */

// 遍历集合的每个元素时 , 会生成流 , 将这些流组合起来
public class FlatMapTest {


    /**
     * "hello"  "world"  --->  h e l o w r d
     */
    public static void main(String[] args) {

        //        List<String> words = Arrays.asList("hello", "world");
        //        List<String> list = words.stream().map(s -> s.split("")).flatMap(strings -> Arrays.stream(strings)).distinct().collect(Collectors.toList());
        //        System.out.println(list);

        List<Integer> list01 = Arrays.asList(1, 2, 3);
        List<Integer> list02 = Arrays.asList(4, 5);
        List<int[]> list = list01.stream().flatMap(i -> list02.stream().map(j -> new int[]{i, j})).collect(Collectors.toList());
        System.out.println(list);


    }
}
