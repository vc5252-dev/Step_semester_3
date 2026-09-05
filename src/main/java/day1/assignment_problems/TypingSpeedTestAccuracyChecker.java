package day1.assignment_problems;

import java.util.Scanner;

public class TypingSpeedTestAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        if (original.length() != typed.length()) {
            System.out.println("The two strings must have equal length.");
            return;
        }

        int matches = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matches++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = original.length() == 0
                ? 100.0
                : (double) matches / original.length() * 100;

        System.out.printf("Accuracy: %.2f%%%n", accuracy);

        if (firstMismatch == -1) {
            System.out.println("No mismatches found.");
        } else {
            System.out.println("First mismatch position: " + firstMismatch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original text: ");
        String original = scanner.nextLine();

        System.out.print("Enter typed text: ");
        String typed = scanner.nextLine();

        checkTypingAccuracy(original, typed);

        scanner.close();
    }
}
