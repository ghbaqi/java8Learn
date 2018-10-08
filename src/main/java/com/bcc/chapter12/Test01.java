package com.bcc.chapter12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * LocalDate
 */
public class Test01 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2018, 10, 8);
        int year = date.getYear();
        Month month = date.getMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("dayofweek = "+dayOfWeek);    // MONDAY

        int lengthOfMonth = date.lengthOfMonth();
        System.out.println("lengthOfMonth = "+lengthOfMonth);  // 31

        boolean leapYear = date.isLeapYear();
        System.out.println("leapYear = "+leapYear);

        LocalDate now = LocalDate.now();
        System.out.println("now = "+now);

        int YEAR = now.get(ChronoField.YEAR);
        int DAY_OF_YEAR = now.get(ChronoField.DAY_OF_YEAR);   // 得到当天的日期是当年的第 多少 天   281
        System.out.println("YEAR = "+YEAR);
        System.out.println("DAY_OF_YEAR = "+DAY_OF_YEAR);

    }
}
