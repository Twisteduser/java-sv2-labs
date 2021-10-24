package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {
        List<String> persons = new ArrayList<>();
        persons.add("John Doe");
        persons.add("Jack Doe");
        persons.add("Jane Doe");
        persons.add("Zöldes Barna");
        persons.add("Sárgás Lilla");
        persons.add("Mezei Virág");
        persons.add("Góliát Dávid");
        persons.add("Győri Gyuri");
        persons.add("Kandisz Nóra");
        persons.add("Ikszipszilón Zénó");

        Random random = new Random();
        int firstIndex = random.nextInt(5);
        int secondIndex = random.nextInt(5) + 5;

        System.out.println(persons.get(firstIndex));
        System.out.println(persons.get(secondIndex));
    }
}