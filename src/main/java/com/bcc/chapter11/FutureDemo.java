package com.bcc.chapter11;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 *
 */
public class FutureDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService threadPool = Executors.newCachedThreadPool();
        Future<Double> future = threadPool.submit(new Callable<Double>() {

            @Override
            public Double call() throws Exception {
                Thread.sleep(2000);
                return 3.14;
            }
        });

        System.out.println("is compute now , can do something else .....");

        Double res = future.get(5, TimeUnit.SECONDS);
        System.out.println("res = "+res);
    }
}
