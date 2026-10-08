package oop.class_problems;

import java.util.*;

class Vehicle {
    String id;
    String type;
    double ratePerDay;
    boolean rented;

    Vehicle(String id, String type, double ratePerDay) {
        this.id = id;
        this.type = type;
        this.ratePerDay = ratePerDay;
        this.rented = false;
    }

    double calculateRent(int days) {
        return ratePerDay * days;
    }

    void display() {
        System.out.println(id + " | " + type + " | Rs." + ratePerDay + "/day | "
                + (rented ? "Rented" : "Available"));
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("V101", "Car", 1500);
        Vehicle v2 = new Vehicle("V102", "Bike", 700);

        v1.rented = true;

        v1.display();
        v2.display();

        int days = 3;
        System.out.println("Rent for " + days + " days: Rs." + v2.calculateRent(days));
    }
}
