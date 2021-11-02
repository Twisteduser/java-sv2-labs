package stringseparate;

import java.util.Arrays;
import java.util.List;

public class IceCream {

    public static void main(String[] args) {

        List<String> iceCreamTypes = Arrays.asList("csoki", "vanília", "eper", "citrom, puncs");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<iceCreamTypes.size(); i++){
            if (i != 0){
                stringBuilder.append(", ");
            }
            stringBuilder.append(iceCreamTypes.get(i));
        }
        System.out.println("Ma kapható: " + stringBuilder.toString() + ". Gyerekeknek féláron!");
    }
}