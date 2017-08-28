package com.tiy;

public class NerdPlayer implements Player {
    private Integer healthPoints;
    private String name;

    public NerdPlayer(String name, Integer healthPoints) {
        this.healthPoints = healthPoints;
        this.name = name;
    }

    @Override
    public Integer getHealthPoints() {
        return this.healthPoints;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void hit(Integer damage) {
        healthPoints -= damage * 2;
    }
}
