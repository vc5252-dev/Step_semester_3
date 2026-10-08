package oop.class_problems;

class Room {
    int roomNumber;
    String type;
    double price;
    boolean booked;

    Room(int roomNumber, String type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.booked = false;
    }

    void book() {
        if (!booked) {
            booked = true;
            System.out.println("Room " + roomNumber + " booked successfully.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    void display() {
        System.out.println("Room " + roomNumber + " | " + type + " | Rs." + price
                + " | " + (booked ? "Booked" : "Available"));
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        Room r1 = new Room(101, "Deluxe", 2500);
        Room r2 = new Room(102, "Standard", 1800);

        r1.display();
        r2.display();

        r1.book();
        r1.book();

        System.out.println("\nUpdated status:");
        r1.display();
        r2.display();
    }
}
