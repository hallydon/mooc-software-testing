package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void invalidShift() {
        CaesarShiftCipher cph = new CaesarShiftCipher();
        String result = cph.CaesarShiftCipher("a@b", 3);
        Assertions.assertEquals("invalid", result);
    }
    @Test
    public void simpleShift() {
        CaesarShiftCipher cph = new CaesarShiftCipher();
        String result = cph.CaesarShiftCipher("abc", 2);
        Assertions.assertEquals("cde", result);
    }
    @Test
    public void positveWrappAround() {
        CaesarShiftCipher cph = new CaesarShiftCipher();
        String result = cph.CaesarShiftCipher("xyz", 2);
        Assertions.assertEquals("zab", result);
    }
    @Test
    public void negativeWrappAround() {
        CaesarShiftCipher cph = new CaesarShiftCipher();
        String result = cph.CaesarShiftCipher("abc", -3);
        Assertions.assertEquals("xyz", result);
    }
    @Test
    public void emptyString() {
        CaesarShiftCipher cph = new CaesarShiftCipher();
        String result = cph.CaesarShiftCipher("", 2);
        Assertions.assertEquals("", result);
    }
    @Test
    public void invalidUpperCase() {
        CaesarShiftCipher cph = new CaesarShiftCipher();
        String result = cph.CaesarShiftCipher("ACD", 2);
        Assertions.assertEquals("invalid", result);
    }




}
