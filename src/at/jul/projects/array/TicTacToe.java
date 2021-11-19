package at.jul.projects.array;

import java.io.InputStream;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int[][] playgroundTicTacToe = new int[3][3];

        printField(playgroundTicTacToe);

    }

    private static void printField(int[][] field) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            System.out.println("Geben sie 1 für Spieler 1 und 2 für Spieler 2 ein");
            int inputPlayer = scanner.nextInt();

            System.out.println("Geben sie entweder 0,1 oder 2 ein");
            int inputRow = scanner.nextInt();
            System.out.println("Geben sie entweder 0,1 oder 2 ein");
            int inputCol = scanner.nextInt();

            if(inputPlayer == 1){
                field[inputCol][inputRow] = 1;
            }else if(inputPlayer == 2){
                field[inputCol][inputRow] = 2;
            }

            for (int row = 0; row < 3; row++) {
                String output = "";
                for (int col = 0; col < 3; col++) {
                    if (field[row][col] == 1) {
                        output += "x";
                    } else if (field[row][col] == 2) {
                        output += "o";
                    } else {
                        output += "|  ";
                    }
                }
                    switch (output) {
                        case "xxx":
                            System.out.println("Spieler 1 hat gewonnen");
                            break;
                        case "ooo":
                            System.out.println("Spieler 2 hat gewonnen");
                            break;
                    }
                System.out.println(output);
            }
        }
    }
}