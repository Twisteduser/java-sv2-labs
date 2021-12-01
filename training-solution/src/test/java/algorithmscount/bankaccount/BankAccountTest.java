package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    public void createAccountTest(){
        BankAccount bankAccount = new BankAccount("John Doe","987ASD123",20_000_000);
        assertEquals("John Doe", bankAccount.getNameOfOwner());
        assertEquals("987ASD123", bankAccount.getAccountNumber());
        assertEquals(20_000_000, bankAccount.getBalance());
    }
}
