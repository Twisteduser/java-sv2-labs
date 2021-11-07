package controlselection.month;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class DayInMonthTest {

    @Test
    void testNumberOfDays() {
        assertEquals(31, new DayInMonth().daysOfMonth(2017, "május"));
        assertEquals(30, new DayInMonth().daysOfMonth(2017, "június"));
        assertEquals(28, new DayInMonth().daysOfMonth(2017, "február"));
    }

    @Test
    void testCase() {
        assertEquals(31, new DayInMonth().daysOfMonth(2017, "MáJuS"));
    }

    @Test
    void testLeapYear() {
        assertEquals(29, new DayInMonth().daysOfMonth(2012, "február"));
    }

    @Test
    void testLeapYear100() {
        assertEquals(28, new DayInMonth().daysOfMonth(1900, "február"));
    }

    @Test
    void testLeapYear400() {
        assertEquals(29, new DayInMonth().daysOfMonth(2000, "február"));
    }

    @Test
    void testIllegalMonth() {
        assertEquals(0, new DayInMonth().daysOfMonth(2021, "oktember"));
    }
}