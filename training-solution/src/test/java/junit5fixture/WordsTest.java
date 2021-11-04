package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class WordsTest {
    Words words;

    @BeforeEach
    void init() {
        words = new Words();
        words.addWord("első");
        words.addWord("második");
        words.addWord("harmadik");
        words.addWord("negyedik");
        words.addWord("ötödik");
        words.addWord("hatodik");
        words.addWord("hetedik");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> expected = Arrays.asList("harmadik", "hatodik", "hetedik");
        words.getWordsStartWith("h");

        assertEquals(expected, words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> expected = Arrays.asList("második","hatodik", "hetedik");
        words.getWordsWithLength(7);

        assertEquals(expected, words.getWords());
    }
}
