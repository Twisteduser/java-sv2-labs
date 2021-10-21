package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Első időpont óra:");
        int hour1 = scanner.nextInt();
        System.out.println("Első időpont perc:");
        int minutes1 = scanner.nextInt();
        System.out.println("Első időpont másodperc:");
        int seconds1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Második időpont óra:");
        int hour2 = scanner.nextInt();
        System.out.println("Második időpont perc:");
        int minutes2 = scanner.nextInt();
        System.out.println("Második időpont másodperc:");
        int seconds2 = scanner.nextInt();
        scanner.nextLine();

        Time time1 = new Time(hour1,minutes1,seconds1);
        Time time2 = new Time(hour2,minutes2,seconds2);

        System.out.println("Első időpont: " + time1.toString() +" = " + time1.getInSeconds() + " perc");
        System.out.println("Második időpont: " + time2.toString() + " = " + time2.getInSeconds() + " perc");

        System.out.println("Első időpont korábbi mint a második? " + time1.earlierThan(time2));

    }
}
