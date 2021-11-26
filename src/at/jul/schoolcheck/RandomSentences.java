package at.jul.schoolcheck;
import java.util.Random;
import java.util.Scanner;

public class RandomSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = {"Er ","Sie ", "Es "};
        String[] arr2 = {"geht ","läuft ","rennt ", "schwimmt ", "reitet ", "fährt "};
        String[] arr3 = {"in die Schule.","nach Hause.", "zur Arbeit"};

        System.out.println("Wählen sie wie viele Sätze sie generieren wollen.");
        int chooseHowManySentencesYouWant = scanner.nextInt();

        for (int i = 0; i < chooseHowManySentencesYouWant; i++) {

            String whichPartOffArr1InSentence = randomPartOffSentence(arr1);
            String whichPartOffArr2InSentence = randomPartOffSentence(arr2);
            String whichPartOffArr3InSentence = randomPartOffSentence(arr3);

            System.out.println(whichPartOffArr1InSentence+whichPartOffArr2InSentence + whichPartOffArr3InSentence);

        }
    }
    public static String randomPartOffSentence(String[] arr){
        Random random = new Random();
        int randomNumber = random.nextInt(arr.length);
        return arr[randomNumber];
    }
}
