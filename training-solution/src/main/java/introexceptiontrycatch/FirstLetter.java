package introexceptiontrycatch;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("kulcs", "telefon", "toll", "egér");
        try {
            for (String s : words){
                System.out.println(s.charAt(0));
            }
        } catch (NullPointerException npe){
            System.out.println(npe.getMessage());
            npe.printStackTrace();
        }
    }
}
