package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void HappyGs() {
        boolean result = new GHappy().gHappy("xxggxx");
        Assertions.assertTrue(result);
    }
    @Test
    public void SingleUnhappyG() {
        boolean result = new GHappy().gHappy("xxgxxx");
        Assertions.assertFalse(result);
    }
    @Test
    public void InBetweenUnhappyG() {
        boolean result = new GHappy().gHappy("xxgxgxx");
        Assertions.assertFalse(result);
    }
    @Test
    public void PairdAndSingleG() {
        boolean result = new GHappy().gHappy("xxggxxgx");
        Assertions.assertFalse(result);
    }
    @Test
    public void MultipleG() {
        boolean result = new GHappy().gHappy("xxgggxxgggx");
        Assertions.assertTrue(result);
    }


}
