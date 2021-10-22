package linebreak;

public class Car {
    private String brand;
    private String type;

    public String getBrandAndTypeInSeparateLines(String brand, String type){
        return brand + "\n"+type;

    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getBrandAndTypeInSeparateLines("Seat","Ibiza"));
    }
}
