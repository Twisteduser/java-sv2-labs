package interfaces.animal;

import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals(){
        return animals.size();
    }

    public int getNumberOfAllLegs(){
        int count = 0;
        for (Animal a: animals){
            count += a.getNumberOfLegs();
        }
        return count;
    }
}
