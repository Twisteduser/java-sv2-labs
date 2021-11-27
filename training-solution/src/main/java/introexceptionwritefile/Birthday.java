package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány ismerőse nevét és születésnapját kívánja rögzíteni?");
        int numberOfPeople = 0;
        try {
            numberOfPeople = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe){
            throw new IllegalArgumentException("Nem egy szám", nfe);
        }

        List<String> birthdays = new ArrayList<>();
        for (int i = 0; i<numberOfPeople; i++){
            System.out.println("Kérjük adja meg a nevet:");
            String name = scanner.nextLine();
            System.out.println("Kérjük adja meg a születésnapot:");
            String dateOfBirth = scanner.nextLine();
            birthdays.add(name+" , "+dateOfBirth);
        }

        Path path = Paths.get("src/main/resources/birthdays.txt");
        try {
            Files.write(path, birthdays);
        } catch (IOException ioe){
            throw new IllegalStateException("Hiba a fájl mentésekor!", ioe);
        }
    }
}
