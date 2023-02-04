package _01_warmup;

import java.util.Arrays;

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 * <p>
 * <p>
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */
public class FrontBack {

    public static void main(String[] args) {

        String palavra = "code";
        System.out.println(frontBack(palavra));

    }

    public static String frontBack(String str) {

        String frontBackWord = "";
        String[] letters = str.split("");

        String firstLetter = letters[0];
        letters[0] = letters[letters.length - 1];
        letters[letters.length - 1] = firstLetter;

        for (int x = 0; x < letters.length; x++) {
            frontBackWord += letters[x];
        }

        return frontBackWord;
    }

}
