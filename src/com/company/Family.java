package com.company;

public abstract class Family {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Family(String name) {
        this.name = name;
    }
}


