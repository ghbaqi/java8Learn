package com.bcc.chapter12;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * LocalTime
 */
public class Test02 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(14, 35, 20);
        System.out.println("time = "+time);

        LocalDate date = LocalDate.parse("2018-09-09");
        LocalTime time1 = LocalTime.parse("15:15:16");
        System.out.println("date = "+date);
        System.out.println("time1 = "+time1);

    }

}
