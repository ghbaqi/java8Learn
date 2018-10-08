package com.bcc.chapter12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * TemporalAdjusters
 *
 */
public class Test07 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDate date1 = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println("date1 = "+date1);

        LocalDate date2 = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("date2 = "+date2);

    }

}
