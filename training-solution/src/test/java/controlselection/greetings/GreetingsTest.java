package controlselection.greetings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GreetingsTest {

    @Test
    void testGreeting(){
        Greetings greetings = new Greetings();
        assertEquals("jó reggelt", greetings.greeting(5,05));
        assertEquals("jó napot", greetings.greeting(9,40));
        assertEquals("jó estét", greetings.greeting(19,40));
        assertEquals("jó éjt", greetings.greeting(2,40));
    }

}
