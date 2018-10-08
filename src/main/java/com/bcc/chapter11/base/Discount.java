package com.bcc.chapter11.base;

public class Discount {

    public enum Code {
        NONE(0), SILVER(5), GOLD(10), PLATINUM(15), DIAMOND(20);

        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }
    }


    // 远程折扣服务
    public static double applyDiscount(Quote quote) {
        try {
            //            Thread.sleep(1000 * product.length());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double p = quote.getPrice() * (100 - quote.getCode().percentage) / 100;
        return p;
    }
}
