package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DagonTest {
    @Test
    void testName(){
        Dragon dragon = new Dragon("Süsü", 1,20);
        assertEquals("Süsü",dragon.getName());
        assertNotEquals("Házi", dragon.getName());
    }

    @Test
    void testNumberOfHeads(){
        Dragon dragon = new Dragon("Süsü", 1,20);
        assertEquals(1,dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads()==1,"True");
        assertFalse(dragon.getNumberOfHeads()==2,"True");
    }

    @Test
    void testHeight(){
        Dragon dragon = new Dragon("Süsü", 1,20);
        assertEquals(18,dragon.getHeight(),3);
    }

    @Test
    void testNull(){
        Dragon dragon = new Dragon("Süsü", 1,20);
        Dragon anotherDragon = null;

        assertNotNull(dragon);
        assertNull(anotherDragon);
    }

    @Test
    void testSameObjects(){
        Dragon dragon = new Dragon("Süsü", 1,20);
        Dragon anotherDragon = dragon;

        assertSame(dragon, anotherDragon);
    }

    @Test
    void testNotSameObjects(){
        Dragon dragon = new Dragon("Süsü", 1,20);
        Dragon copyDragon = new Dragon("Süsü", 1,20);

        assertNotSame(copyDragon, dragon);
    }
}
