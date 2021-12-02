package algorithmsdecision.words;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WordTest {
    @Test
    void testContainsLongerWord(){
        Word word = new Word();
        List<String> words = Arrays.asList("egy", "kettő", "három", "négy", "öt", "hat");

        assertTrue(word.containsLongerWord(words, "tíz"));
        assertFalse(word.containsLongerWord(words,"százhúsz"));
        assertFalse(word.containsLongerWord(words,"negyven"));
    }
}
