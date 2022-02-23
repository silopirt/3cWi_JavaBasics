package at.jul.projects.array;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] wordsToPlayWith = {"Julian", "Hilfe", "Manuel","Milian", "Jonathan", "Serkan"};
        int numberToChooseWord = getRandomNumber(wordsToPlayWith);
        String guessOfThePlayer = getInputToGuessWord();


    }
    private static int getRandomNumber(String[] whichWordToChoose){
        Random random = new Random();
        int numberToChooseWord = random.nextInt(whichWordToChoose.length);
        System.out.println(numberToChooseWord);
        return numberToChooseWord;
    }
    private static String getInputToGuessWord(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie ihren Buchstaben ein den sie raten möchten.");
        String inputForGuessingWord = scanner.next();

        return inputForGuessingWord;
    }

}