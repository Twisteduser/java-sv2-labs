package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance = new Performance("Bring me the horizon",
                LocalDate.of(2022,2,15),
                LocalTime.of(18,00),LocalTime.of(22,00));
        System.out.println(performance.getInfo());
    }
}
