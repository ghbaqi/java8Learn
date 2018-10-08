package com.bcc.chapter12;


import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * with
 *
 * 日期对象都是不可修改的 ， 使用 with 方法会生成一个 新的日期对象
 */
public class Test06 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2017, 2, 2);


        LocalDate date1 = date.withYear(2018);
        System.out.println("date1= "+date1);

        LocalDate date2 = date.withMonth(12);
        System.out.println("date2 = "+date2);

        LocalDate date3 = date.with(ChronoField.DAY_OF_MONTH, 25);
        System.out.println("date3 = "+date3);

        // 以相对方式修改 date
        LocalDate date4 = date.plusWeeks(5);
        System.out.println("date4 = "+date4);

        LocalDate date5 = date.plusYears(3);
        System.out.println("date5 = "+date5);

    }

}
