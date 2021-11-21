package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        int number = new PositiveNumber().inputNumber();
        System.out.println(number);
    }

    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 0) {
            throw new IllegalArgumentException("Not positive!");
        }
        return number;
    }
}
