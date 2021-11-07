package controliteration.division;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int max = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divNumber = scanner.nextInt();
        scanner.nextLine();
//        int count = 0;
//        while (count < max) {
//            if (count % divNumber == 0) {
//                System.out.print(count + ", ");
//                count++;
//            } else {
//                count++;
//            }
//
//        }
        for (int i = 0; i < max; i++) {
            if (i % divNumber == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
