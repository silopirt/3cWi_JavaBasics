package at.jul.projects.array;
import javax.swing.*;
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
            boolean gameEnd = false;

            int inputPlayer = 0;
            int inputRow = 0;
            int inputCol = 0;
                try{
                    System.out.println("Geben sie 1 für Spieler 1 und 2 für Spieler 2 ein");
                    inputPlayer = scanner.nextInt();

                    System.out.println("Geben sie entweder 0,1 oder 2 ein für die Reihe");
                    inputRow = scanner.nextInt();
                    System.out.println("Geben sie entweder 0,1 oder 2 ein für die Spalte");
                    inputCol = scanner.nextInt();
                }catch(Exception e){
                    System.out.println("Geben sie bitte eine Zahl ein");
                }

            if (inputPlayer == 1) {
                field[inputRow][inputCol] = 1;
            } else if (inputPlayer == 2) {
                field[inputRow][inputCol] = 2;
            }

            for (int row = 0; row < 3; row++) {
                String output = "";
                for (int col = 0; col < 3; col++) {
                    if (field[row][col] == 1) {
                        output += "x ";
                    } else if (field[row][col] == 2) {
                        output += "o ";
                    } else {
                        output += "| ";
                    }
                }
                System.out.println(output);
            }
            gameEnd = checkIfWinner(field, gameEnd);
            if (gameEnd == true) {
                break;
            }
        }
    }

    private static boolean checkIfWinner(int[][] field, boolean gameEnd) {
        for (int row = 0; row < 3; row++) {
            if ((field[row][0] == field[row][1] && field[row][1] == field[row][2]) && field[row][0] != 0) {
                gameEnd = true;
            }
            for (int col = 0; col < 3; col++) {
                if ((field[0][col] == field[1][col] && field[1][col] == field[2][col]) && field[0][col] != 0) {
                    gameEnd = true;
                } else if ((field[0][0] == field[1][1] && field[1][1] == field[2][2]) && field[0][0] != 0) {
                    gameEnd = true;
                } else if ((field[0][2] == field[1][1] && field[1][1] == field[2][0]) && field[0][2] != 0) {
                    gameEnd = true;
                }
            }
        }
        return gameEnd;
    }
}