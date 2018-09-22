package com.bcc.chapter02;

public class ThreadExample {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("hello world");
            System.out.println("222");
        }).start();
    }
}
