package day2.assignment_problems;

import java.util.Scanner;

public class ATMPinLengthValidator {

    public static void checkPIN(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
            return;
        }

        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                System.out.println("Invalid PIN — must be exactly 4 digits.");
                return;
            }
        }

        System.out.println("PIN length OK.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        checkPIN(pin);

        scanner.close();
    }
}
