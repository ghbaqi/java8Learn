package com.bcc.chapter09;

import com.bcc.chapter09.base.Car;
import com.bcc.chapter09.base.Insurance;
import com.bcc.chapter09.base.Persion;

import java.util.Optional;

/**
 * 提取和转换值
 */
public class Test02 {

    public static void main(String[] args) {

//        Optional<Insurance> insurance = Optional.of(new Insurance(4, "in 04"));
//        Optional<String> name = insurance.map(Insurance::getName);
//        System.out.println(name.get());

        Car carOpt = new Car("car01",Optional.of(new Insurance(1,"in01")));
        Persion persion = new Persion("p01",Optional.of(carOpt));
        Optional<Persion> optionalPersion = Optional.of(persion);
        Optional<String> insuranceName = optionalPersion.flatMap(p -> persion.getCar())
                .flatMap(Car::getInsurance)
                .map(Insurance::getName);
        System.out.println(insuranceName.get());

    }

}
