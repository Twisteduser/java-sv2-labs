package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GentlemanTest {

    @Test
    void testSayHelloName() {
        // Given
        String name = "John Wick";

        // When
        String greeting = new Gentleman().sayHello(name);

        // Then
        assertEquals("Hello John Wick", greeting);
    }

    @Test
    void testSayHelloNoName() {
        // Given
        String name = null;
        // When
        String greeting = new Gentleman().sayHello(name);
        // Then
        assertEquals("Hello Anonymous", greeting);
    }
}