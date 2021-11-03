package formatlocaleprintf;

import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ív Béla", "Dörmögő Dömötör", "Spongyabob Kockanadrág");

        for (String s : names){
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!", s);
            System.out.println();
        }
    }
}
