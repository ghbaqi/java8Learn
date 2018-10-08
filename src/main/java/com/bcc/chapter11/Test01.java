package com.bcc.chapter11;

import com.bcc.chapter11.base.Shop;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Test01 {


    // 使用异步 API
    public static void main(String[] args) {

        Shop shop = new Shop("shopA");
        Future<Double> aaa = shop.getPriceAsync("aaa");
        try {
            Double price = aaa.get(5, TimeUnit.SECONDS);
            System.out.println("price = " + price);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }

    }
}
