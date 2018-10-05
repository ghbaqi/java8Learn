package com.bcc.chapter09;

import com.bcc.chapter09.base.Insurance;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {

//        Optional<Insurance> empty = Optional.empty();
//        Insurance insurance = empty.orElse(new Insurance(1, "i 01"));
//        System.out.println(empty.isPresent());
//        System.out.println(insurance);


//        Optional<Insurance> insurance = Optional.of(new Insurance(2, "in 02"));
//        System.out.println(insurance.get());


//        Insurance insurance = null;
        Insurance insurance = new Insurance(3,"in 03");
        Optional<Insurance> in = Optional.ofNullable(insurance);
        System.out.println(in);

    }

}
