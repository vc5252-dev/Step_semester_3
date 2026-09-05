package day2.assignment_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StopWordFilteredWordFrequencyReport {

    public static void printFilteredWordFrequency(String feedback) {
        String[] stopWords = {"the", "was", "and", "a", "is", "for", "in"};

        String cleaned = feedback.toLowerCase()
                .replaceAll("[^a-z0-9\\s]", " ");

        String[] words = cleaned.trim().split("\\s+");

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty() || isStopWord(word, stopWords)) {
                continue;
            }

            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        frequency.entrySet().stream()
                .sorted((a, b) -> {
                    int byFrequency = Integer.compare(b.getValue(), a.getValue());

                    if (byFrequency != 0) {
                        return byFrequency;
                    }

                    return a.getKey().compareTo(b.getKey());
                })
                .forEach(entry ->
                        System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    private static boolean isStopWord(String word, String[] stopWords) {
        for (String stopWord : stopWords) {
            if (word.equals(stopWord)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter feedback: ");
        String feedback = scanner.nextLine();

        printFilteredWordFrequency(feedback);

        scanner.close();
    }
}
