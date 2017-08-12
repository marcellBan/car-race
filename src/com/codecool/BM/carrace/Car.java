package com.codecool.BM.carrace;

import java.util.List;
import java.util.Random;

class Car extends Vehicle {
    private static final int BASE_SPEED = 80;
    private static final int SPEED_MODIFIER_MAX = 30;
    static List<String> nameList;
    private static int speedLimit = -1;

    static void setSpeedLimit(int limit) {
        speedLimit = limit;
    }

    Car(Random rng) {
        speed = BASE_SPEED + rng.nextInt(SPEED_MODIFIER_MAX + 1);
        name = nameList.get(rng.nextInt(nameList.size())) + nameList.get(rng.nextInt(nameList.size()));
    }

    @Override
    void moveForAnHour(Random rng, boolean isRaining) {
        if (speedLimit != -1) {
            distanceTravelled += speed;
        } else {
            distanceTravelled += speedLimit;
        }
    }
}
