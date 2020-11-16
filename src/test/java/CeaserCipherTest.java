import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCipherTest {

    @Test
    public void rotateCharacter_CorrectNumberofTimesAtEndOfAlphabet_char(){
        char input='a';
        char expectedOutput='b';
        assertEquals(expectedOutput, CeaserCipher.cipher(input, 1));
    }
}