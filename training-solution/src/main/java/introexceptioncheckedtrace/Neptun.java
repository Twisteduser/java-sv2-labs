package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {
    public static void main(String[] args) {
        Neptun neptun = new Neptun();
        List<String> namesAndNeptun = new ArrayList<>();

        try {
            namesAndNeptun = neptun.readNameAndNeptun();
        } catch (IOException ioe) {
            System.out.println("Can not read file");
        }

        List<String> neptunCodes = new ArrayList<>();
        for (String s : namesAndNeptun){
            String[] temp = s.split(",");
            neptunCodes.add(temp[1]);
        }
        System.out.println(neptunCodes);
    }
    private List<String> readNameAndNeptun() throws IOException {
         List<String> namesAndNeptun = Files.readAllLines(Paths.get("neptun.csv"));
         return namesAndNeptun;
    }
}

