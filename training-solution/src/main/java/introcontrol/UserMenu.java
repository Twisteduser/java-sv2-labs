package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérjük válasszon az alábbi lehetőségek közül:\n" + "1. Felhasználók listázása\n" + "2. Felhasználó felvétele\n" + "Többi: Kilépés");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number == 1){
            System.out.println("Felhasználók listázása");
        }if (number ==2){
            System.out.println("Felhasználó felvétele");
        }
    }
}
