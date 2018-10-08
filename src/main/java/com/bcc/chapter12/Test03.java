package com.bcc.chapter12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 合并 LocalDate 和 LocalTime   ----> LocalDateTime
 */
public class Test03 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2000, 10, 25);
        LocalTime time = LocalTime.of(11, 11, 11);

        LocalDateTime localDateTime01 = date.atTime(time);
        LocalDateTime localDateTime02 = time.atDate(date);
        System.out.println("localDateTime01 = "+localDateTime01);
        System.out.println("localDateTime02 = "+localDateTime02);


        LocalDate localDate = localDateTime01.toLocalDate();
        LocalTime localTime = localDateTime01.toLocalTime();
        System.out.println("localDate = "+localDate);
        System.out.println("localTime = "+localTime);

    }

}
