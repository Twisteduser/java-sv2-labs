package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> habitants, int max) {
        boolean contains = false;
        for (int i: habitants){
            if (i<max){
                return true;
            }
        }
        return contains;
    }
}
