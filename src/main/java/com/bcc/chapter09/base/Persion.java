package com.bcc.chapter09.base;

import java.util.Optional;

public class Persion {

    private String name;
    private Optional<Car> car;

    public Persion(String name, Optional<Car> car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Car> getCar() {
        return car;
    }

    public void setCar(Optional<Car> car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
