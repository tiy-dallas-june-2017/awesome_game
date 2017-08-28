package com.tiy;

public class GenericPlayer implements Player {
    //Health Points
    private Integer healthPoints;
    //Name ?
    private String name;

    public GenericPlayer(String name, Integer healthPoints) {
        this.healthPoints = healthPoints;
        this.name = name;
    }

    @Override
    public Integer getHealthPoints() {
        return healthPoints;
    }

    @Override
    public String getName() {
        return name;
    }

    //Hit amount of damage
    @Override
    public void hit(Integer damage){
        healthPoints -= damage;
    }
}
