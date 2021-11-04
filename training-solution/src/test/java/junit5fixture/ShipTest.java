package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void init(){
        ship = new Ship("Mérges Rája SS",1970,217.3);
    }

    @Test
    void testName(){
        assertEquals("Mérges Rája SS", ship.getName());
        assertNotEquals("Titanic", ship.getName());
    }

    @Test
    void testYearOfConstruction(){
        assertEquals(1970, ship.getYearOfConstruction());
        assertNotEquals(1980, ship.getYearOfConstruction());
    }

    @Test
    void testLength(){
        assertEquals(217, ship.getLength(),0.5);
    }

    @Test
    void testNull(){
        Ship anotherShip = null;
        assertNotNull(ship);
        assertNull(anotherShip);
    }

    @Test
    void testSameObjects() {
        Ship anotherShip = ship;
        assertSame(ship, anotherShip);
    }

    @Test
    void testNotSameObjects() {
        Ship anotherShip = new Ship("Titanic", 1958, 105.2);
        assertNotSame(ship, anotherShip);
    }
}
