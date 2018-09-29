package com.bcc.chapter8.template;


public class OnlineBanking01 extends OnlineBanking {

    @Override
    protected void makeCustomerHappy(Customer customer) {
        System.out.println("给顾客 " + customer.getName() + ":" + customer.getId() + " 唱首歌");
    }
}
