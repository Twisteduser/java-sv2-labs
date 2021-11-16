package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a vásárló nevét:");
        String name = scanner.nextLine();
        System.out.println("Melyik filmre szeretne jegyet venni?");
        String movie = scanner.nextLine();
        System.out.println("Hány darab jegyet szeretne vásárolni?");
        int ticketNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Melyik sorba kéri a jegyeket?");
        int rowNum = scanner.nextInt();
        scanner.nextLine();


        StringBuilder sb = new StringBuilder("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:\n");
        sb.append("Vásárló neve: ").append(name).append("\n").append("Film címe: ").append(movie).append("\n").append("Lefoglalt helyek: ");
            for (int i =1; i <= ticketNum; i++){
                sb.append(rowNum).append(". sor ").append(i).append(". szék");
                if (i<ticketNum){
                    sb.append(", ");
                }
            }
        sb.append("\nJó szórakozást!");
        System.out.println(sb);
       }
    }
