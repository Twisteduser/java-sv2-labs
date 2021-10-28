package intromethods.registration;
import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public LocalDate fullDateOfBirth(int year, int month, int day){
        return LocalDate.of(year,month,day);
    }

    public static void main(String[] args) {
        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vezetéknév:");
        String firstName = scanner.nextLine();

        System.out.println("Keresztnév:");
        String lastName = scanner.nextLine();

        System.out.println("Születési év:");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Születési hónap:");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Születési nap:");
        int day = scanner.nextInt();
        scanner.nextLine();

        System.out.println("E-mail cím:");
        String email = scanner.nextLine();

        String name = registration.fullName(firstName, lastName);
        LocalDate dateOfBirth = registration.fullDateOfBirth(year,month,day);

        Person registered = new Person(name,dateOfBirth,email);
        System.out.println("A regisztráció adatai: ");
        System.out.println(registered);


    }
}
