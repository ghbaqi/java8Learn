package com.bcc.chapter09.base;

public class Insurance {

    private int id;
    private String name;

    public Insurance(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
