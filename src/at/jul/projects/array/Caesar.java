package at.jul.projects.array;

import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        System.out.println("Geben sie ihre Botschaft ein");
        Scanner scanner = new Scanner(System.in);
        String inputMessage = scanner.next();
        int move = 2;

        char source[] = inputMessage.toCharArray();


        String result = encrypt(source, move);
        System.out.println(result);

        char[] convertDataForDecryption = result.toCharArray();
        String resultD = decrypt(convertDataForDecryption, move);
        System.out.println(resultD);

    }

    private static String encrypt(char[] source,int move) {
        String[] encryptedOutput = new String[source.length];
        String encrypt = "";
        for (int e = 0; e < source.length; e++) {
            int newLetter = source[e] + move;
            if (newLetter > 122) {
                newLetter -= 26;
                encrypt = Character.toString(newLetter);
                encryptedOutput[e]= encrypt;

            } else {
                encrypt = Character.toString(newLetter);
                encryptedOutput[e] = encrypt;

            }
        }
        String convertedEncrypt = convertStringArrayToString(encryptedOutput);
        return convertedEncrypt;
    }

    private static String convertStringArrayToString(String[]  data){
        String result ="";
        for (int i = 0; i < data.length; i++) {
            result += data[i];
        }
        return result;

    }
    private static String convertDecryption(String[]  data){
        String resultDecryption ="";
        for (int i = 0; i < data.length; i++) {
            resultDecryption += data[i];
        }
        return resultDecryption;

    }

    private static String decrypt(char[] convertedEncrypt, int move) {
        String[] decryptOutput = new String[convertedEncrypt.length];
        String decrypt = "";
        for(int d = 0; d < convertedEncrypt.length;d++){
            int backToOldLetter = convertedEncrypt[d] - move;
            if(backToOldLetter < 97){
                backToOldLetter+=26;
                decrypt = Character.toString(backToOldLetter);
                decryptOutput[d] = decrypt;

            }else{
                decrypt = Character.toString(backToOldLetter);
                decryptOutput[d] = decrypt;

            }
        }
        String convertDecrypt = convertDecryption(decryptOutput);
        return convertDecrypt;
    }
}