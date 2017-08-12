package com.codecool.BM.carrace;

import java.util.*;

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
        Car.nameList = FileLoader.loadFile("data/nameList.txt");
        for (int i = 0; i < VEHICLE_PER_TYPE; i++) {
            vehicles.add(new Car(rng));
            vehicles.add(new Motorcycle());
            vehicles.add(new Truck(rng));
        }
    }

    private static void simulateRace() {
        for (int i = 0; i < RACE_DURATION; i++) {
            isRaining = rng.nextDouble() < RAIN_CHANCE;
            Car.setSpeedLimit(rng.nextDouble() < SPEED_LIMIT_CHANCE ? CAR_SPEED_LIMIT : -1);
            for (Vehicle v : vehicles) {
                v.moveForAnHour(rng, isRaining);
            }
        }
    }

    private static void printRaceResults() {
        Collections.sort(vehicles, Comparator.comparingInt(v -> ((Vehicle) v).distanceTravelled).reversed());
        for (Vehicle v : vehicles) {
            System.out.println(
                    v.name +
                            " travelled " +
                            v.distanceTravelled +
                            " kms (" +
                            v.getClass().getSimpleName() +
                            ")"
            );
        }
    }
}
