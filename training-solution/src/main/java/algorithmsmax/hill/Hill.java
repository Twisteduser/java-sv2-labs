package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> heights){
        int max = heights.get(0);
        for (int i : heights) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
