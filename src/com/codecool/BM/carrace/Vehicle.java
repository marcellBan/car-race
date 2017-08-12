package com.codecool.BM.carrace;

import java.util.Random;

abstract class Vehicle {
    protected int speed;
    int distanceTravelled = 0;
    String name;

    abstract void moveForAnHour(Random rng, boolean isRaining);
}
