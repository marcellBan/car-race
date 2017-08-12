package com.codecool.BM.carrace;

import java.util.Random;

class Truck extends Vehicle {
    private static final double BREAKDOWN_CHANCE = 0.05;
    private static final int BREAKDOWN_DURATION = 2;
    private static final int BASE_SPEED = 100;
    private int breakdownTurnsLeft = 0;

    Truck() {

    }

    @Override
    void moveForAnHour(Random rng, boolean isRaining) {

    }
}
