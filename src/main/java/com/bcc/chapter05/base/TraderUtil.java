package com.bcc.chapter05.base;

import java.util.Arrays;
import java.util.List;

public class TraderUtil {

    private static Trader raoul = new Trader("Raoul","Cambridge");
    private static Trader mario = new Trader("Mario","Milan");
    private static Trader alan = new Trader("Alan","Cambridge");
    private static Trader brian = new Trader("Brian","Cambridge");

    public static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian,2011,300)
            ,new Transaction(raoul,2012,1000)
            ,new Transaction(raoul,2011,400)
            ,new Transaction(mario,2012,710)
            ,new Transaction(mario,2012,700)
            ,new Transaction(alan,2012,950));
}
