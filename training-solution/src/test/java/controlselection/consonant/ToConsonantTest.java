package controlselection.consonant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ToConsonantTest {
    @Test
    void testVowels(){
        assertEquals('b',new ToConsonant().nextCorrectLetter('a'));
        assertEquals('f',new ToConsonant().nextCorrectLetter('e'));
        assertEquals('v',new ToConsonant().nextCorrectLetter('u'));
    }
    @Test
    void testNotVowels(){
        assertEquals('b',new ToConsonant().nextCorrectLetter('b'));
        assertEquals('x',new ToConsonant().nextCorrectLetter('x'));
        assertEquals('t',new ToConsonant().nextCorrectLetter('t'));
    }

}
