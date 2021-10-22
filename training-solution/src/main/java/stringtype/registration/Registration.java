package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password1 = scanner.nextLine();

        System.out.println("Confirm your password:");
        String password2 = scanner.nextLine();

        System.out.println("Ener your email address");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        System.out.println(userValidator.isValidUsername(username) ? "Your username is correct" : "Your username is incorrect");
        System.out.println(userValidator.isValidPassword(password1,password2) ? "Correct password" : "Incorrect password");
        System.out.println(userValidator.isValidEmail(email) ? "Correct email address" : "Incorrect email address");

    }
}
