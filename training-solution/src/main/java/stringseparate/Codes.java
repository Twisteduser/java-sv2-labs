package stringseparate;

import java.util.Arrays;
import java.util.List;

public class Codes {

    public String getCodesStartWithLetter (List<String> codes){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<codes.size();i++){
            char character = codes.get(i).toUpperCase().charAt(0);
            if (character >= 'A' && character <= 'Z'){
                stringBuilder.append(codes.get(i));
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Codes codes = new Codes();

        List<String> words = Arrays.asList("T57fbj", "xtcu45", "f578GVHd","8asdf");
        System.out.println(codes.getCodesStartWithLetter(words));

    }
}