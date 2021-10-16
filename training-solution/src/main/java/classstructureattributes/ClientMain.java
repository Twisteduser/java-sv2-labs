package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("Dear User, please enter your name:");
        client.name = scanner.nextLine();
        System.out.println("Please add your date of birth:");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please add your address:");
        client.address = scanner.nextLine();

        System.out.println("Your name is " + client.name + ", and you were born in " + client.year + ", and your address is " + client.address);

    }
}
