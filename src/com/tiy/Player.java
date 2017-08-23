package com.tiy;

public class Player {
    //Health Points
    private Integer healthPoints;
    //Name ?
    private String name;

    public Player(String name, Integer healthPoints) {
        this.healthPoints = healthPoints;
        this.name = name;
    }

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    //Hit amount of damage
    public void hit(Integer damage){
        healthPoints -= damage;
    }
}
