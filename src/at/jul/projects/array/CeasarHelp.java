package at.jul.projects.array;

import java.util.Scanner;

public class CeasarHelp {
    public static void main(String[] args){
        System.out.println("Geben sie ein um wie viel sie die Buchstaben verschieben wollen");
        Scanner scanner = new Scanner(System.in);
        int changeLetter = scanner.nextInt();
        char letters[] = new char[26];
        int count = 0;

        getLetters(letters, count);

    }

    private static void getLetters(char[] letters, int count) {
        for(char a = 97; a<= 122; a++){
            letters[count]= Character.valueOf(a);
            System.out.print(letters);
            count++;
        }
    }
}
