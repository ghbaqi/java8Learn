package com.bcc.chapter12;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTimeFormatter
 */
public class DateTimeFormatterDemo {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        String s1 = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("s1 = " + s1);

        String s2 = now.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("s2 = " + s2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String s3 = now.format(formatter);
        System.out.println("s3 = " + s3);

        LocalDate date = LocalDate.parse("25/01/1999", formatter);
        System.out.println("date = " + date);


    }

}
