package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dorog", "Leányvár", "Pilisjászfalu", "Piliscsaba", "Pilisvörösvár", "Pilisborosjenő", "Üröm", "Budapest");
        try {
            Files.write(Paths.get("roadmap.txt"), names);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
