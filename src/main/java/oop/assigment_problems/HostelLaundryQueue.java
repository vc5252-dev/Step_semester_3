package oop.assigment_problems;

import java.util.*;

public class HostelLaundryQueue {
    static Queue<String> queue = new LinkedList<>();

    static void addStudent(String name) {
        queue.offer(name);
        System.out.println(name + " added to laundry queue.");
    }

    static void serveStudent() {
        if (queue.isEmpty()) {
            System.out.println("Laundry queue is empty.");
        } else {
            System.out.println(queue.poll() + " is being served.");
        }
    }

    static void displayQueue() {
        System.out.println("Current queue: " + queue);
    }

    public static void main(String[] args) {
        addStudent("Asha");
        addStudent("Riya");
        addStudent("Karan");

        displayQueue();
        serveStudent();
        displayQueue();
    }
}
