package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Shopping {
    public static void main(String[] args) {
        try {
            List<String> holiday = Files.readAllLines(Paths.get("shoppinglist.txt"));
            System.out.println(holiday);
        }catch (IOException ioe){
            System.out.println("Can not read file");
            ioe.printStackTrace();
        }

    }
}
