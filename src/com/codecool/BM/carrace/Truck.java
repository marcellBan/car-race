package com.codecool.BM.carrace;

import java.util.Random;

class Truck extends Vehicle {
    private static final double BREAKDOWN_CHANCE = 0.05;
    private static final int BREAKDOWN_DURATION = 2;
    private static final int BASE_SPEED = 100;
    private int breakdownTurnsLeft = 0;

    Truck(Random rng) {
        speed = BASE_SPEED;
        name = Integer.toString(rng.nextInt(1001));
    }

    @Override
    void moveForAnHour(Random rng, boolean isRaining) {
        if (breakdownTurnsLeft > 0) {
            breakdownTurnsLeft--;
        } else {
            if (rng.nextDouble() < BREAKDOWN_CHANCE) {
                breakdownTurnsLeft += BREAKDOWN_DURATION;
                breakdownTurnsLeft--;
            } else {
                distanceTravelled += speed;
            }
        }
    }
}
