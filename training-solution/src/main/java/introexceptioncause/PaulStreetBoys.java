package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class PaulStreetBoys {

    public static void main(String[] args) {
    List<String> names = new PaulStreetBoys().readNames();
    for (String s:names){
        if (s.equals("Nemecsek Ernő")){
            System.out.println(s.toLowerCase());
        } else
            System.out.println(s);
    }

}

    public List<String> readNames() {
        try {
            return Files.readAllLines(Paths.get("palutcaifiuk.txt"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
