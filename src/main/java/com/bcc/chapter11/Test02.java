package com.bcc.chapter11;

import com.bcc.chapter11.base.Shop;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * 使用 completableFuture 将同步请求变成异步请求
 */
public class Test02 {

    public static void main(String[] args) {

        // 发起异步请求
        List<CompletableFuture<String>> res = Shop.SHOPS.stream().map(shop ->
                CompletableFuture.supplyAsync(() -> shop.getName() + " price = " + shop.getPrice("pro01"), Shop.THREAD_POOL)
        ).collect(Collectors.toList());

        // 等待所有请求结束
        List<String> strings = res.stream().map(f -> f.join()).collect(Collectors.toList());
        System.out.println(strings);

    }
}
