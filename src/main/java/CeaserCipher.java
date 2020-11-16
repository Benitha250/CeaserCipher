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
}
