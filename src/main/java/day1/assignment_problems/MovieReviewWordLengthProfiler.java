package day1.assignment_problems;

import java.util.Scanner;

public class MovieReviewWordLengthProfiler {

    public static void classifyWordLengths(String review) {
        if (review == null || review.trim().isEmpty()) {
            System.out.println("Short words (1-4): 0");
            System.out.println("Medium words (5-8): 0");
            System.out.println("Long words (9+): 0");
            return;
        }

        String[] words = review.trim().split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "");
            int length = cleanWord.length();

            if (length >= 1 && length <= 4) {
                shortWords++;
            } else if (length <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println("Short words (1-4): " + shortWords);
        System.out.println("Medium words (5-8): " + mediumWords);
        System.out.println("Long words (9+): " + longWords);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        classifyWordLengths(scanner.nextLine());

        scanner.close();
    }
}
