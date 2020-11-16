//package CeaserCipher;

import java.util.Scanner;

public class CeaserCipher {

    private String text;
    private int shift;

    public CeaserCipher(String text, int shift) {
        this.text = text;
        this.shift = shift;
    }

    public String getText() {
        return text;
    }

    public int getShift() {
        return shift;
    }


    public static char cipher(char c, int k) {
        //Here we declare some helping constants
        final int alphaLength = 26;
        final char asciiShift = Character.isUpperCase(c) ? 'A' : 'a';
        final int cipherShift = k % alphaLength;

        // we shift down to 0..25 for a..z
        char shifted = (char) (c - asciiShift);

        // Here we rotate the letter and handle "wrap-around" for negatives and value >= 26
        shifted = (char) ((shifted + cipherShift + alphaLength) % alphaLength);

        // Here we shift back up to english characters
        return (char) (shifted + asciiShift);
    }

    public  String cipher() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ')
            {
                sb.append(" ");
            }
            else
            {
                sb.append(cipher(text.charAt(i), shift));
            }

        }
        return sb.toString();
    }
}
