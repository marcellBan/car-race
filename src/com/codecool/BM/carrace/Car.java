package com.codecool.BM.carrace;

import java.util.List;
import java.util.Random;

class Car extends Vehicle {
    private static final int BASE_SPEED = 80;
    private static final int SPEED_MODIFIER_MAX = 30;
    static List<String> nameList;
    private static int speedLimit = -1;

    static void setSpeedLimit(int limit) {

    }

    Car(Random rng) {

    }

    @Override
    void moveForAnHour(Random rng, boolean isRaining) {

    }
}
