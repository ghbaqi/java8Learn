package com.bcc.chapter11.base;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class Shop {

    public static final List<Shop> SHOPS = Arrays.asList(
            new Shop("s1")
            , new Shop("s22")
            , new Shop("s333")
            , new Shop("s4444"));

    // 线程池
    public static final Executor THREAD_POOL = Executors.newFixedThreadPool(20, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        }
    });

    private String name;


    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // 加入折扣
    public String getPrice2(String product) {

        double price = calculatePrice(product);
        Random random = new Random();
        Discount.Code code = Discount.Code.values()[random.nextInt(Discount.Code.values().length)];

        return String.format("%s:%.2f:%s",name,price,code);
    }

    public double getPrice(String product) {

        try {
            //            Thread.sleep(1000 * product.length());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 0.1111 + this.getName().length();
    }


    /**
     * 将同步方法转换为异步方法
     * <p>
     * 手动创建 CompletableFuture
     */
    public Future<Double> getPriceAsync01(String product) {

        CompletableFuture<Double> future = new CompletableFuture<>();
        new Thread(() -> {
            try {
                double price = calculatePrice(product);
                future.complete(price);
            } catch (Exception e) {
                e.printStackTrace();
                future.completeExceptionally(e);    //  错误的处理
            }
        }).start();

        return future;
    }

    private double calculatePrice(String product) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 0.111 + this.getName().length();
    }

    /**
     * 使用工厂方法创建 CompletableFuture
     */
    public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> future = CompletableFuture.supplyAsync(() -> calculatePrice(product));
        return future;
    }
}
