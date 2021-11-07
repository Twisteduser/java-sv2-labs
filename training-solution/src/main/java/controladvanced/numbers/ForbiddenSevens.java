package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg az első számot:");
        int firstNum = scanner.nextInt();
        scanner.nextLine();

        for (int i = firstNum; i >= firstNum; i++){
            if (i%7==0){
                System.out.println("X");
                continue;
            }
            if (Integer.toString(i).contains("7")){
                break;
            }
            System.out.println(i);
        }
    }
}
