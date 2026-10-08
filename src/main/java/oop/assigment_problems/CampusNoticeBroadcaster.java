package oop.assigment_problems;

import java.util.*;

public class CampusNoticeBroadcaster {
    static List<String> notices = new ArrayList<>();

    static void addNotice(String notice) {
        notices.add(notice);
    }

    static void broadcast() {
        System.out.println("Campus Notices:");

        for (String notice : notices) {
            System.out.println("- " + notice);
        }
    }

    public static void main(String[] args) {
        addNotice("Internal assessment starts Monday.");
        addNotice("Library will remain open until 9 PM.");
        addNotice("Hackathon registrations are now open.");

        broadcast();
    }
}
