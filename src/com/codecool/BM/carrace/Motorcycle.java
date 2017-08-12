package com.codecool.BM.carrace;

import java.util.Random;

class Motorcycle extends Vehicle {
    private static final int BASE_SPEED = 100;
    private static final int BASE_SLOWDOWN = 5;
    private static final int SLOWDOWN_MODIFIER_MAX = 45;
    private static int nameNumber = 0;

    Motorcycle() {
        speed = BASE_SPEED;
        name = "Motorcycle " + nameNumber++;
    }

    @Override
    void moveForAnHour(Random rng, boolean isRaining) {
        distanceTravelled += speed;
        if (isRaining) {
            distanceTravelled -= BASE_SLOWDOWN + rng.nextInt(SLOWDOWN_MODIFIER_MAX + 1);
        }
    }
}
