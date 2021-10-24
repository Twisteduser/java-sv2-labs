package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> frozenThings = new ArrayList<>();
        frozenThings.add("1 kg csirkemell");
        frozenThings.add("1 kg borsó");
        frozenThings.add("1 fagyisdoboznyi pörkölt");
        frozenThings.add("2 kg dió");
        frozenThings.add("3 doboz fagyi");

        System.out.println(frozenThings);
        System.out.println(frozenThings.size());

        frozenThings.remove("1 kg borsó");
        frozenThings.remove("0.3 kg dió");

        System.out.println(frozenThings);
        System.out.println(frozenThings.size());
    }
}