package com.bcc.chapter12;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * 时间间隔
 * Duration
 * Period
 */
public class Test04 {

    public static void main(String[] args) {

        LocalTime time01 = LocalTime.of(13, 2, 20);
        LocalTime time02 = LocalTime.of(13, 3, 0);

        Duration duration = Duration.between(time01, time02);
        System.out.println("duration = "+duration.getSeconds());


        LocalDate date01 = LocalDate.of(2018, 10, 1);
        LocalDate date02 = LocalDate.of(2018, 10, 21);
        Period period = Period.between(date01, date02);
        System.out.println("period = "+period.getDays());


    }

}
