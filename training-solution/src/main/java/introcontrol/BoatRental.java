package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        int freeBoats = 3;
        int freeBoatPlaces = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("A csapat létszáma:");
        int people = scanner.nextInt();
        if (people > 3){
            System.out.println("5 fős csónak");
            people = people-5;
            freeBoats--;
            freeBoatPlaces = freeBoatPlaces-5;
        }
        if (people > 2){
            System.out.println("3 fős csónak");
            people = people-3;
            freeBoats--;
            freeBoatPlaces = freeBoatPlaces-3;
        }
        if (people > 0){
            System.out.println("2 fős csónak");
            people = people-2;
            freeBoats--;
            freeBoatPlaces = freeBoatPlaces-2;
        }
        if (people > 0){
            System.out.println("Nem fért el mindenki");
        }else {
            System.out.println("Üres helyek száma: " + freeBoatPlaces);
            System.out.println("Üres csónakok száma: " + freeBoats);
        }
    }
}
