package algorithmssum.sales;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesAmountSumCalculatorTest {
    @Test
    public void testSumSalesAmount(){
        SalesAmountSumCalculator test = new SalesAmountSumCalculator();

        List<Salesperson> salespersons = Arrays.asList(
                new Salesperson("John", 100),
                new Salesperson("Béla", 300),
                new Salesperson("Jane",400),
                new Salesperson("Joe", 500)
        );

        assertEquals(1300, test.income(salespersons));
    }
}
