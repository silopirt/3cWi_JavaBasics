package at.jul.projects.array;

import java.io.InputStream;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        char[][] playgroundTicTacToe= new char[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie entweder 1,2 oder 3 ein");
        int inputGameOnX = scanner.nextInt();
        System.out.println("Geben sie entweder 1,2 oder 3 ein");
        int inputGameOnY = scanner.nextInt();

        buildField(playgroundTicTacToe,inputGameOnX,inputGameOnY);
    }

    private static void buildField(char[][] playgroundTicTacToe,int inputGameI, int inputGameJ) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                playgroundTicTacToe[i][j] = playgroundTicTacToe[inputGameI][inputGameJ];
                if (i == 0) {
                    if (j == 2) {
                        printLineForPlaygroundBreakLine(playgroundTicTacToe[i][j]);
                    } else {
                        printLineForPlayground(playgroundTicTacToe[i][j]);
                    }
                } else if (i == 1) {
                    if (j == 2) {
                        printLineForPlaygroundBreakLine(playgroundTicTacToe[i][j]);
                    } else {
                        printLineForPlayground(playgroundTicTacToe[i][j]);
                    }
                } else {
                    printLineForPlayground(playgroundTicTacToe[i][j]);
                }
            }
        }
    }
    private static void printLineForPlayground(char c) {
        System.out.print("|" + c);
    }
    private static void printLineForPlaygroundBreakLine(char c) {
        System.out.println("|" + c);
    }
}
