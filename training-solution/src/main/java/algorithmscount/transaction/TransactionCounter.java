package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {
    public int countCreditTransactions(List<Transaction> transactions, int maxAmount) {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() < maxAmount && transaction.isCredit() == true) {
                count++;
            }
        }
        return count;
    }
}
