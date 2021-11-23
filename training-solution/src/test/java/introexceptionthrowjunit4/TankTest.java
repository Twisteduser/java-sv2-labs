package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {

    @Test
    public void testAngle() {
        new Tank().modifyAngle(30);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrongAngle() {
        new Tank().modifyAngle(100);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testAddWrongAngleRule() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Túl nagy szög");
        new Tank().modifyAngle(100);
    }

    @Test
    public void testAddWrongRuleAssertThrows(){
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> new Tank().modifyAngle(100));
        assertEquals("Túl nagy szög", illegalArgumentException.getMessage());
    }

}
