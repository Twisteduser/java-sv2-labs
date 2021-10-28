package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        Dog dog1 = new Dog("Snoopy", 3,"Foltos");
        Dog dog2 = new Dog("Pluto", 4,"Barna");
        Dog dog3 = new Dog("Gromit", 5,"Krémszin");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        System.out.println(dogs);

        Dog dog4 = dogs.get(1);
        dog4.setColour("Barna");

        System.out.println(dogs);

        Dog dog5 = new Dog("Kramplusz", 33, "Barna");
        System.out.println(dog5);

        dog5 = dogs.get(1);
        System.out.println(dog5);

        dogs.add(dog5);

        Dog dog6 = dog4;
        dog6.setColour("Fehér");

        System.out.println(dogs);

        List<Dog> dogs2 = dogs;
        Dog dog7 = dog4;
        dog7.setColour("Fekete");

        System.out.println(dogs2);

        dog2.setColour("Pöttyös");
        System.out.println(dogs2);

        dog2 = null;
        System.out.println(dogs2);

        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println(dogs2);

        Dog dog9 = dogs.get(1);
        dog9.setColour("Lila");
        System.out.println(dogs2);

    }
}
