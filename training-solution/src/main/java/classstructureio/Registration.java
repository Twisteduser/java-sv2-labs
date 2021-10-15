package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Dear User, please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Please add your e-mail address:");
        String userEmail = scanner.nextLine();
        System.out.println("You succesfully registered with the following details. Name: " + userName + ", E-mail address:" + userEmail);
    }
}
