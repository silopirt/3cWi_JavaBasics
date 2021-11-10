package at.jul.projects.array;

public class StringHelper {
    public static void main(String[] args) {
        //isPalidrom("Hans", "snaH");
        //reverseString("Hans");
        //countLetters("bitte ned", 't');
        //printAmountOfLetters("julian");

    }
    public static boolean isPalidrom(String text, String reverse){
        char[] justTheInputArr = text.toCharArray();
        char[] reverseTextArr = new char[text.length()];
        boolean outputTrueOrFalse = true;
        for (int i = 1; i <= justTheInputArr.length; i++) {
            reverseTextArr[text.length()-i] = justTheInputArr[i-1];
            System.out.println(reverseTextArr);
        }
        if(areArraysEqual(reverseTextArr,reverse.toCharArray())){
            outputTrueOrFalse = true;
            System.out.println(outputTrueOrFalse);
        }else{
            outputTrueOrFalse = false;
            System.out.println(outputTrueOrFalse);
        }
        return outputTrueOrFalse;
    }

    public static boolean areArraysEqual(char[] a1, char[] a2){
        if (a1.length!=a2.length) return false;

        for (int i = 0; i < a1.length; i++) {
            if (a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }

    public static int countLetters(String text, char check){
        char[] textToCharArr = text.toCharArray();
        int timesLetterIsUsed = 0;
        for (int i = 0; i < textToCharArr.length; i++) {
            if(textToCharArr[i] == check){
                timesLetterIsUsed++;
            }
        }
        System.out.println("Der Buchstabe " + check +  " wird " +  timesLetterIsUsed + " mal benutzt.");
        return timesLetterIsUsed;
    }

    public static String reverseString(String text){
        char[] justTheInputArr = text.toCharArray();
        char[] reverseTextArr = new char[text.length()];

        for (int i = 1; i <= justTheInputArr.length; i++) {
            reverseTextArr[text.length()-i] = justTheInputArr[i-1];
            System.out.println(reverseTextArr);
        }
        return reverseTextArr.toString();
    }

    public static int printAmountOfLetters(String text){
        char[] textToCharArr = text.toCharArray();
        int lengthOfString = 0;
        for (int i = 0; i < textToCharArr.length; i++) {
            lengthOfString++;
        }
        System.out.println("Der Text ist " + lengthOfString +  " Zeichen lang");
        return lengthOfString;
    }
}