package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        List<String> todos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean end = false;

        while (end == false){
            System.out.println("Adja meg a következő teendőt! (kilépéshez nyomja meg az X-et)");
            String todo = scanner.nextLine();
            if (todo.toLowerCase().equals("x")){
                end = true;
            }else{
                todos.add(todo);
            }
        }
        Path path = Paths.get("src/main/resources/todos.txt");
        try {
            Files.write(path, todos);
        } catch (IOException ioe) {
            throw new IllegalStateException("Hiba a fájl mentésekor!", ioe);
        }
    }
    }
