package algorithmssum.sales;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SalespersonTest {
    @Test
    void testCreateSalesperson(){
        Salesperson salesperson = new Salesperson("Jack", 1900);
        assertEquals("Jack", salesperson.getName());
        assertEquals(1900, salesperson.getAmount());
    }
}
