package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {
    public List<String> readCoords() {
        try {
            return Files.readAllLines(Paths.get("tracking.csv"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void getHeights(List<String> tracking){
        List<Integer> heights = new ArrayList<>();
        for (String s: tracking){
            String[] temp = s.split(";");
            int height = Integer.parseInt(temp[2]);
            heights.add(height);

        }
        printHeights(heights);
    }
    private void printHeights(List<Integer> heights) {
        for (int i = 0; i < heights.size() - 1; i++) {
            System.out.println(heights.get(i + 1) - heights.get(i));
        }
    }
}
