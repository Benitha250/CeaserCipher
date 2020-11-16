import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCipherTest {

    @Test
    public void rotateCharacter_CorrectNumberofTimesofShifts_char(){
        char input='a';
        char expectedOutput='z';
        assertEquals(expectedOutput, CeaserCipher.cipher(input, 25));
    }

    @Test
    public void rotateCharacter_CorrectNumberofTimesAtEndOfAlphabet_char(){
        char input='a';
        char expectedOutput='b';
        assertEquals(expectedOutput, CeaserCipher.cipher(input, 1));
    }

    @Test
    public void rotateCharacter_CorrectNumberofTimes_char(){
        char input='f';
        char expectedOutput='i';
        assertEquals(expectedOutput, CeaserCipher.cipher(input, 3));
    }


}