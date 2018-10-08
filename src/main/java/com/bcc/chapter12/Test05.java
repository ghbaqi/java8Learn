package com.bcc.chapter12;

import java.time.Duration;
import java.time.Period;

/**
 * 时间间隔
 * Duration
 * Period
 */
public class Test05 {

    public static void main(String[] args) {

        Duration duration = Duration.ofHours(1);
        System.out.println("duration = "+duration.getSeconds());

        Period period = Period.of(2, 0, 10);
        System.out.println("period getDays = "+period.getDays());
        System.out.println("period getYears  = "+period.getYears());
    }

}
