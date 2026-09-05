package day2.assignment_problems;

import java.util.Scanner;

public class LibraryISBNNormalizerValidator {

    public static String normalizeCode(String raw) {
        if (raw == null) {
            return "";
        }

        return raw.trim().replace(" ", "");
    }

    public static String validateAndFormat(String code) {
        String normalized = normalizeCode(code);

        if (normalized.length() != 13) {
            return "Invalid: wrong length";
        }

        String publisher = normalized.substring(0, 3);
        String year = normalized.substring(3, 7);
        String catalog = normalized.substring(7);

        for (int i = 0; i < publisher.length(); i++) {
            if (!Character.isLetter(publisher.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < normalized.length(); i++) {
            if (!Character.isDigit(normalized.charAt(i))) {
                return "Invalid: catalog/year body must contain digits only";
            }
        }

        return "["
                + publisher.toUpperCase()
                + "] YEAR: "
                + year
                + " | CATALOG: "
                + catalog;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ISBN-like code: ");
        String code = scanner.nextLine();

        System.out.println(validateAndFormat(code));

        scanner.close();
    }
}
