package com.bcc.chapter8.strategy;


public class IsAllLowerCase implements ValidationStrategy {
    @Override
    public boolean validate(String s) {
        return s.matches("[a-z]+");
    }
}
