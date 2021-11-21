package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {
    private List<String> names = new ArrayList<>(Arrays.asList("Szerencsés Tihamér", "Béna Béla", null, "Hókuszpók", "John Wick"));

    public List<String> getNames() {
        return names;
    }

    public String getWinner(){
        Random random = new Random();
        int i = random.nextInt(names.size());
        String winner = names.get(i);
        return winner.toUpperCase();

    }
}
