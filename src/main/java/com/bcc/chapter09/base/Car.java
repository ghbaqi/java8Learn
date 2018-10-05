package com.bcc.chapter09.base;

import java.util.Optional;

public class Car {

    private String   name;
    private Optional<Insurance> insurance;

    public Car(String name, Optional<Insurance> insurance) {
        this.name = name;
        this.insurance = insurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

    public void setInsurance(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", insurance=" + insurance +
                '}';
    }
}
