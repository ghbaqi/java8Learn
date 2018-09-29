package com.bcc.chapter8.template;

import java.util.function.Consumer;

/**
 * 银行接待顾客的模板类
 *
 */
public  class OnlineBanking02 {

    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy){
        Customer jack = new Customer("jack", id);
        makeCustomerHappy.accept(jack);
    }



}
