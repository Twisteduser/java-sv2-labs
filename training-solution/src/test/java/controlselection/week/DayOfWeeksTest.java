package controlselection.week;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class DayOfWeeksTest {
    @Test
    void whichDay(){
        assertEquals("hét eleje", new DayOfWeeks().getDaysOfWeek("hétfő"));
        assertEquals("hét közepe", new DayOfWeeks().getDaysOfWeek("szerda"));
        assertEquals("majdnem hétvége", new DayOfWeeks().getDaysOfWeek("péntek"));
        assertEquals("hét vége", new DayOfWeeks().getDaysOfWeek("vasárnap"));
    }
    @Test
    void testLowerCase(){
        assertEquals("hét eleje", new DayOfWeeks().getDaysOfWeek("HÉTFő"));
    }
    @Test
    void invalidDay(){
        assertEquals("ismeretlen nap", new DayOfWeeks().getDaysOfWeek("keddfő"));
    }
}
