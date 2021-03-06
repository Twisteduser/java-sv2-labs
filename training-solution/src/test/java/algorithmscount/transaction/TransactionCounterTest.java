package algorithmscount.transaction;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TransactionCounterTest {

    @Test
    void testCountEntryLessThan() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("1234", TransactionType.CREDIT, 1000),
                new Transaction("1234", TransactionType.CREDIT, 2000),
                new Transaction("1234", TransactionType.CREDIT, 3000),
                new Transaction("1234", TransactionType.CREDIT, 4000)
        );

        assertEquals(1, new TransactionCounter().countCreditTransactions(transactions, 2000));
        assertEquals(0, new TransactionCounter().countCreditTransactions(transactions, 1000));
        assertEquals(4, new TransactionCounter().countCreditTransactions(transactions, 10000));
    }
}