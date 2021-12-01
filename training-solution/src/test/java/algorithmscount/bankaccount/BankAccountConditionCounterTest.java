package algorithmscount.bankaccount;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BankAccountConditionCounterTest {


    @Test
    public void testBankAccountWithBalanceGreaterThan(){
        List<BankAccount> bankAccounts = Arrays.asList(
                new BankAccount("John Doe", "456", 100),
                new BankAccount("Jane Doe", "123", 200),
                new BankAccount("Joe Doe", "645", 300),
                new BankAccount("John Wick", "987", 400));
        assertEquals(3, new BankAccountConditionCounter().countWithBalanceGreaterThan(bankAccounts,100));
        assertEquals(0,new BankAccountConditionCounter().countWithBalanceGreaterThan(bankAccounts,400));
    }
}
