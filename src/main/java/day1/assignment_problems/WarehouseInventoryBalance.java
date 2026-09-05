package day1.assignment_problems;

import java.util.Scanner;

public class WarehouseInventoryBalance {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA.length != sectionB.length) {
            System.out.println("Both sections must have the same number of items.");
            return;
        }

        int totalA = 0;
        int totalB = 0;
        int highestQuantity = Integer.MIN_VALUE;
        int highestIndex = -1;
        String highestSection = "";

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];

            if (sectionA[i] > highestQuantity) {
                highestQuantity = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }

            if (sectionB[i] > highestQuantity) {
                highestQuantity = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }

        System.out.println("Section A total: " + totalA);
        System.out.println("Section B total: " + totalB);

        if (totalA == totalB) {
            System.out.println("Inventory is balanced.");
        } else {
            System.out.println("Inventory is not balanced.");
        }

        System.out.println("Highest quantity: " + highestQuantity);
        System.out.println("Section: " + highestSection);
        System.out.println("Index: " + highestIndex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter quantities for Section A:");
        for (int i = 0; i < n; i++) {
            sectionA[i] = scanner.nextInt();
        }

        System.out.println("Enter quantities for Section B:");
        for (int i = 0; i < n; i++) {
            sectionB[i] = scanner.nextInt();
        }

        analyzeInventory(sectionA, sectionB);

        scanner.close();
    }
}
