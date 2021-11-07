package controlselection.accents;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class WithoutAccentsTest {
    @Test
    void accentLetter(){
        assertEquals('a',new WithoutAccents().charConverter('á'));
        assertEquals('A',new WithoutAccents().charConverter('Á'));
        assertEquals('o',new WithoutAccents().charConverter('ó'));
        assertEquals('O',new WithoutAccents().charConverter('Ó'));
    }
    @Test
    void withoutAccentLetter(){
        assertEquals('a',new WithoutAccents().charConverter('a'));
    }
}
