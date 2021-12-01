package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
    public int getMin(List<Integer> numbers){
        int min=numbers.get(0);
        for (Integer i:numbers){
            if (i<min){
                min=i;
            }
        }
        return min;
    }
}
