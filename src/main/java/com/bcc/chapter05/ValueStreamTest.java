package com.bcc.chapter05;

import com.bcc.chapter05.base.TraderUtil;
import com.bcc.chapter05.base.Transaction;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * 数值流  原始类型特化
 * 避免装拆箱的成本
 */
public class ValueStreamTest {

    public static void main(String[] args) {


        IntStream intStream = TraderUtil.transactions.stream().mapToInt(Transaction::getValue);
        int sum = intStream.sum();
        System.out.println("sum = "+sum);

        IntStream intStream2 = TraderUtil.transactions.stream().mapToInt(Transaction::getValue);
        OptionalDouble average = intStream2.average();
        System.out.println("average = "+average.getAsDouble());

        IntStream intStream3 = TraderUtil.transactions.stream().mapToInt(Transaction::getValue);
        OptionalInt max = intStream3.max();
        System.out.println("average = "+max.getAsInt());

        IntStream.rangeClosed(1,100).forEach(System.out::println);

    }
}
