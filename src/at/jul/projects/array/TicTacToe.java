package at.jul.projects.array;

public class TicTacToe {
    public static void main(String[] args){
        char[][] playgroundTicTacToe= new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                playgroundTicTacToe[i][j] = playgroundTicTacToe[i][j];
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
