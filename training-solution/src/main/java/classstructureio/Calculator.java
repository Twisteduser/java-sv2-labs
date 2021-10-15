package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Please enter the first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        System.out.println("Please enter the second number:");
        int secondNum = scanner.nextInt();
        System.out.println(firstNum + "+" + secondNum);
        System.out.println(firstNum+secondNum);
    }
}
