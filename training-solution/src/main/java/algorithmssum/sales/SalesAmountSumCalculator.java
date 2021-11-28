package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {
    public int income(List<Salesperson> sales){
        int sum = 0;
        for (Salesperson salesperson: sales) {
            sum += salesperson.getAmount();
        }
        return sum;
    }
}
