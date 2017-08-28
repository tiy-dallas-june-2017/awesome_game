package com.tiy;

public interface Player {

    Integer getHealthPoints();

    String getName();

    //Hit amount of damage
    void hit(Integer damage);
}
