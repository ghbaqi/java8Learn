package com.bcc.chapter11;

import com.bcc.chapter11.base.Discount;
import com.bcc.chapter11.base.Quote;
import com.bcc.chapter11.base.Shop;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;


/**
 * 使用 CompletableFuture 构建组合式异步应用
 * <p>
 * completableFuture   thenCompose   第二个 future 依赖第一个的执行结果  a    -> f(a)
 * completableFuture   thenCombine   两个 future 不存在先后依赖         a,b  ->  a*b
 */
public class Test03 {

    public static void main(String[] args) {

        String product = "aaaaa";
        long start = System.currentTimeMillis();

        List<CompletableFuture<Double>> futureList = Shop.SHOPS.stream()
                .map(shop ->
                        CompletableFuture.supplyAsync(() -> shop.getPrice2(product), Shop.THREAD_POOL)
                ).map(future -> future.thenApply(Quote::parse))
                .map(f -> f.thenCompose(quote ->
                        CompletableFuture.supplyAsync(() -> Discount.applyDiscount(quote), Shop.THREAD_POOL)
                )).collect(Collectors.toList());

        List<Double> priceList = futureList.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println(priceList);

        long end = System.currentTimeMillis();
        System.out.println("time used = " + (end - start));


    }
}
