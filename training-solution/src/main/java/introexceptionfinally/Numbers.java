package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írjon be egy tetszőleges számot");
        int number = 0;
        boolean end = false;
        while (end == false){
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number%2==0){
                    end = true;
                }
            }catch (NumberFormatException nfe){
                throw new IllegalArgumentException("Not a number", nfe);
            }finally {
                System.out.println("End of round");
            }

        }

    }
}
