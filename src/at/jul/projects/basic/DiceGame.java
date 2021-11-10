package at.jul.projects.basic;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Wählen sie 1 um zu spielen\n" +
                    "Wählen sie 2 um das Spiel zu beenden");

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int gameMode = scanner.nextInt();

            int player = 0;
            int computer = 0;

            if (playGame(gameMode)) {
                for (int m = 0; m < 6; m++) {
                    int dicePlayer = random.nextInt(6) + 1;
                    player += dicePlayer;
                    System.out.println(dicePlayer + " P");
                }
                for (int c = 0; c < 6; c++) {
                    int diceComputer = random.nextInt(6) + 1;
                    computer += diceComputer;
                    System.out.println(diceComputer + " C");
                }
                if (player > computer) {
                    printGameStandings(player, computer, "Du hast gewonnen");
                } else if (player < computer) {
                    printGameStandings(player, computer, "Du hast verloren");
                } else {
                    printGameStandings(player, computer, "Gleichstand");
                }
            } else {
                System.out.println("Spiel beendet");
                break;
            }

        }
    }

    private static void printGameStandings(int player, int computer, String s) {
        System.out.println(s);
        System.out.println(computer + " C");
        System.out.println(player + " P");
    }

    public static boolean playGame(int selection) {
        if (selection == 1) {
            return true;
        } else {
            return false;
        }
    }
}
