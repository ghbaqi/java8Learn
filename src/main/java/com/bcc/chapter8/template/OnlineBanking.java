package com.bcc.chapter8.template;

/**
 * 银行接待顾客的模板类
 *
 */
public abstract class OnlineBanking {

    public void processCustomer(int id){

        Customer customer = new Customer("ghbaqi", id);
        makeCustomerHappy(customer);
    }

    protected abstract void makeCustomerHappy(Customer customer);


}
