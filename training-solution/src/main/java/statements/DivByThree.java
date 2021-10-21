package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy egész számot: ");
        int number = scanner.nextInt();
        System.out.println("A beírt szám " + (number % 3 ==0 ? "osztható" : "nem osztható") + " hárommal.");
    }
}
