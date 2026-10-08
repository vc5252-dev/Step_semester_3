package oop.assigment_problems;

import java.util.*;

public class CampusPremiereTicketCounter {
    static Set<String> bookedSeats = new HashSet<>();

    static void bookSeat(String seat) {
        if (bookedSeats.add(seat)) {
            System.out.println(seat + " booked successfully.");
        } else {
            System.out.println(seat + " is already booked.");
        }
    }

    static void displayBookedSeats() {
        System.out.println("Booked seats: " + bookedSeats);
    }

    public static void main(String[] args) {
        bookSeat("A1");
        bookSeat("A2");
        bookSeat("A2");
        bookSeat("B1");

        displayBookedSeats();
    }
}
