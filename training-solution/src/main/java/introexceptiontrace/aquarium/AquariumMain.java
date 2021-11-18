package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Fish fish1 = new Fish("Lazac", "Vörös");
        Fish fish2 = new Fish("Cápa", "Kék");
        Fish fish3 = new Fish("Ponty", "Sárga");
        Fish fish4 = new Fish("Tonhal", "Fekete");

        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        aquarium.addFish(fish3);
        aquarium.addFish(fish4);

        System.out.println(aquarium.getNumberOfFish());
//"this.ornamentalFish" is null, nincs példányosítva
    }
}
