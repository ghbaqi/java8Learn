package com.bcc.chapter8.template;

public class Test02 {

    public static void main(String[] args) {

        OnlineBanking02 banking02 = new OnlineBanking02();
        banking02.processCustomer(101, customer -> System.out.println("给顾客 " + customer.getName() + ":" + customer.getId() + " 按摩"));
    }
}
