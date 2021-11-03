package introjunit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GentlemanTest {
    @Test
    public void testGentleman(){
        String name = "John Wick";
        String greeting = new Gentleman().sayHello(name);
        assertEquals("Hello John Wick",greeting);
    }
    @Test
    public void testGentlemanWithNoName(){
        String name = null;
        String greeting = new Gentleman().sayHello(name);
        assertEquals("Hello Anonymus",greeting);
    }
}
