package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy több tagmondatból álló mondatot:");
        String sentence = scanner.nextLine();

        System.out.println("Írd be egy mégegyszer:");
        String anotherSentence = scanner.nextLine();

        System.out.println(sentence);
        Scanner s = new Scanner(anotherSentence).useDelimiter(", ");
        while (s.hasNext()){
            System.out.println(s.next());
        }
    }
}
