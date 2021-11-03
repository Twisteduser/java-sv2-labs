package stringscanner;

import java.util.Scanner;

public class IntScanner {
    public String convertInts(String ints) {
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 100) {
                stringBuilder.append(number);
                stringBuilder.append(",");
            }
        }
        String result = stringBuilder.toString();
        if (result.length() ==0){
            return result;
        }
        return result.substring(0, result.length()-1);
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();

        System.out.println(intScanner.convertInts("5;34;346;57;58;123;325;66;754"));
        System.out.println(intScanner.convertInts("101"));
        System.out.println(intScanner.convertInts("12,46,16,99"));
        System.out.println(intScanner.convertInts(""));
    }
}
