package conventions;

public class Car {
    private String CarType;
    private String engineType;
    private int doors;
    private int persons;


    public Car(String carType, String engineType, int doors, int persons){
        this.CarType = carType;
        this.engineType = engineType;
        this.doors = doors;
        this.persons = persons;
    }

    public void setCarType(String carType) {
        this.CarType = carType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;}


    public void SetDoors(int doors) {
        this.doors = doors;
    }

    public void SetPersonS(int persons) {
        this.persons = persons;
    }

    public int getPersons() {
        return persons;
    }

    public String getCarType() {
        return CarType;
    }

    public String GetEngineType() {
        return engineType;
    }

    public int getDoors() {
        return doors;
    }

    public void addModelName(String ModelName) {
        this.CarType = CarType + " " + ModelName;
    }
}