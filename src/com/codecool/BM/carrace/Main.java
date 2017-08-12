package com.codecool.BM.carrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final double RAIN_CHANCE = 0.3;
    private static final double SPEED_LIMIT_CHANCE = 0.3;
    private static final int CAR_SPEED_LIMIT = 70;
    private static final int VEHICLE_PER_TYPE = 10;
    private static final int RACE_DURATION = 50;
    private static boolean isRaining;
    private static Random rng = new Random();
    private static List<Vehicle> vehicles = new ArrayList();

    public static void main(String[] args) {
        createVehicles();
        simulateRace();
        printRaceResults();
    }

    private static void createVehicles() {

    }

    private static void simulateRace() {

    }

    private static void printRaceResults() {

    }
}
