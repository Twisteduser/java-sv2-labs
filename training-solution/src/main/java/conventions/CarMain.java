package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Seat","1.9tdi",3,5);
        System.out.println(car.getCarType());
        System.out.println(car.GetEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());

        car.addModelName("Cupra");
        System.out.println(car.getCarType());
        System.out.println(car.GetEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());

    }
}
