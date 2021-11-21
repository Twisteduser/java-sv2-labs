package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        String word = new ShortWord().inputText();
        System.out.println(word);
    }

    public String inputText() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (word.length()>=5){
            throw new IllegalArgumentException("Több mint 5 betű!");
        }
        return word;
    }
}


