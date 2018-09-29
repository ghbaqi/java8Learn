package com.bcc.chapter8.strategy;

public class IsNumeric implements ValidationStrategy {
    @Override
    public boolean validate(String s) {
        return s.matches("\\d+");
    }
}
