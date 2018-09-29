package com.bcc.chapter8.strategy;

// 需要函数式接口的地方  都可以用 lambda 表达式替代
public class Test {

    public static void main(String[] args) {

        ValidationStrategy v1 = new IsAllLowerCase();
        Validator validator = new Validator(v1);
        boolean b1 = validator.validate("aaadfggbb");
        System.out.println(b1);
        boolean b2 = validator.validate("saf546");
        System.out.println(b2);

        System.out.println("---------------");

        Validator validator01 = new Validator(s -> s.matches("\\d+"));
        boolean b3 = validator01.validate("128930");
        boolean b4 = validator01.validate("12333404.");
        System.out.println(b3);
        System.out.println(b4);
    }
}
