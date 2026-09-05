package day2.class_problems;

import java.util.Scanner;

public class BankTransactionReferenceGenerator {

    public static String normalizeReference(String raw) {
        if (raw == null) {
            return "";
        }

        return raw.trim().replace(" ", "");
    }

    public static String validateAndFormat(String reference) {
        String normalized = normalizeReference(reference);

        if (normalized.length() != 14) {
            return "Invalid: wrong length";
        }

        String bankCode = normalized.substring(0, 3);

        for (int i = 0; i < bankCode.length(); i++) {
            if (!Character.isLetter(bankCode.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        for (int i = 3; i < normalized.length(); i++) {
            if (!Character.isDigit(normalized.charAt(i))) {
                return "Invalid: remaining 11 characters must be digits";
            }
        }

        String date = normalized.substring(3, 9);
        String sequence = normalized.substring(10);

        return "["
                + bankCode.toUpperCase()
                + "] DATE: "
                + date.substring(0, 2) + "/" + date.substring(2, 4) + "/" + date.substring(4, 6)
                + " | SEQ: "
                + sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter bank transaction reference: ");
        String reference = scanner.nextLine();

        System.out.println(validateAndFormat(reference));

        scanner.close();
    }
}
