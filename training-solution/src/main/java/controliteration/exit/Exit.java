package controliteration.exit;

import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = "exit";
        do {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával");
            System.out.println("Kilépés: 'x' billentyű megnyomásával");
            c = scanner.nextLine();
        } while (!c.equals("x"));
    }
}
