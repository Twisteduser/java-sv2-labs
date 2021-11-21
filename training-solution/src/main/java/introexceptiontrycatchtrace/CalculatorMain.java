package introexceptiontrycatchtrace;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Irja be az első számot");
        int firstNum = 0;
        try {
            firstNum = scanner.nextInt();
            scanner.nextLine();
        } catch (NumberFormatException nfe){
            System.out.println("Nem megfelelő szám");
        }

        System.out.println("Idj be  második számot");
        int secondNum = 0;
        try {
            secondNum = scanner.nextInt();
            scanner.nextLine();
        }catch (NumberFormatException numberFormatException){
            System.out.println("Nem megfelelő szám");
        }
        System.out.println("Melyik műveletet végezzük el?\n 1. Összeadás\n 2. Kivonás\n 3. Szorzás\n 4. Osztás" );
        String command = scanner.nextLine();

        try {
            switch (command){
                case "1":
                    System.out.println("eredmény:" + calculator.add(firstNum, secondNum) );
                    break;
                case "2":
                    System.out.println("eredmény:" + calculator.subtract(firstNum,secondNum));
                    break;
                case "3":
                    System.out.println("eredmény:" + calculator.multiplicate(firstNum, secondNum));
                    break;
                case "4":
                    System.out.println("eredmény egyész része:" + calculator.divide(firstNum, secondNum));
                    break;
                default:
                    System.out.println("A művelet nem végezhető el");
            }
        } catch (ArithmeticException ae){
            System.out.println("Nem értelmezhető művelet");
        }

    }
}
