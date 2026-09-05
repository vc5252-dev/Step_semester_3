package day1.class_problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};
        int rounds = 5;
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        System.out.println("Rock-Paper-Scissors Game");

        for (int round = 1; round <= rounds; round++) {
            System.out.print("Round " + round + " - Enter your move (Rock, Paper, Scissors): ");
            String playerMove = scanner.nextLine().trim();

            while (!playerMove.equalsIgnoreCase("Rock") &&
                   !playerMove.equalsIgnoreCase("Paper") &&
                   !playerMove.equalsIgnoreCase("Scissors")) {
                System.out.print("Invalid move. Enter Rock, Paper, or Scissors: ");
                playerMove = scanner.nextLine().trim();
            }

            playerMove = capitalizeMove(playerMove);
            String computerMove = moves[random.nextInt(moves.length)];

            String result = playRound(playerMove, computerMove);

            if (result.equals("Player Wins")) {
                playerWins++;
            } else if (result.equals("Computer Wins")) {
                computerWins++;
            } else {
                draws++;
            }

            System.out.println("Round " + round + " | Player Move: " + playerMove
                    + " | Computer Move: " + computerMove + " | Result: " + result);
        }

        double percentage = (playerWins * 100.0) / rounds;

        System.out.println("\nFinal Summary (after " + rounds + " rounds)");
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%\n",
                playerWins, computerWins, draws, percentage);

        scanner.close();
    }

    private static String capitalizeMove(String move) {
        move = move.toLowerCase();
        return Character.toUpperCase(move.charAt(0)) + move.substring(1);
    }
}
