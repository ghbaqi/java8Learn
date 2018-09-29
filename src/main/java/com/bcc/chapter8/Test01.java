package com.bcc.chapter8;

/**
 * 将出现函数式接口的地方用 lambda 表达式替代
 */
public class Test01 {

    public static void main(String[] args) {

        new Thread(() -> System.out.println("thread run")).start();
    }

}
