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
            int whichPartOffArr1InSentence = 0;
            whichPartOffArr1InSentence = randomPartOffSentence(arr1, whichPartOffArr1InSentence);
            int whichPartOffArr2InSentence =0;
            whichPartOffArr2InSentence = randomPartOffSentence(arr2, whichPartOffArr2InSentence);
            int whichPartOffArr3InSentence =0;
            whichPartOffArr3InSentence = randomPartOffSentence(arr3, whichPartOffArr3InSentence);

            System.out.println(arr1[whichPartOffArr1InSentence]+ arr2[whichPartOffArr2InSentence] + arr3[whichPartOffArr3InSentence]);

        }
    }
    public static int randomPartOffSentence(String[] arr,int randomNumber){
        Random random = new Random();
        randomNumber = random.nextInt(arr.length - 0)  + 0;
        return randomNumber;
    }
}
