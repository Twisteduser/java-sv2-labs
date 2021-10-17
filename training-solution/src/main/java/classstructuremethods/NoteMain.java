package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Note note = new Note();

        System.out.println("Enter your name: ");
        note.setName(scanner.nextLine());

        System.out.println("Enter your topic: ");
        note.setTopic(scanner.nextLine());

        System.out.println("Enter your text: ");
        note.setText(scanner.nextLine());

        System.out.println(note.getNoteText());
    }
}
