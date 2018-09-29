package com.bcc.chapter8.strategy;

public class Validator {

    private ValidationStrategy validationStrategy;

    public Validator(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean validate(String s) {
        return validationStrategy.validate(s);
    }
}
