package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionTest {
    @Test
    public void createTransactionTest(){
        Transaction transaction = new Transaction("ASD123ASD465", TransactionType.CREDIT, 100);

        assertEquals("ASD123ASD465", transaction.getAccountNumber());
        assertTrue(transaction.isCredit());
        assertFalse(transaction.isDebit());
        assertEquals(100, transaction.getAmount());
    }
}
