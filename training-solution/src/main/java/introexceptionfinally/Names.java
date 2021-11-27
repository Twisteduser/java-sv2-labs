package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Names {
    private List<String> readNames() {
        try {
            return Files.readAllLines(Paths.get("src/test/resources/names.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        } finally {
            System.out.println("End of read");
        }
    }

    public static void main(String[] args) {
        List<String> names = new Names().readNames();
        List<String> drNames = new ArrayList<>();
        for (String s : names) {
            if (s.startsWith("dr")) {
                drNames.add(s);
            } else {
                drNames.add("");
            }
        }
        System.out.println(drNames);
    }
}
