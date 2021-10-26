package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, int year, int month, int day){
        this.description = description;
        this.startTime = LocalDate.of(year, month, day);
    }
    public void registerPerson(int person){
        numberOfPeople = numberOfPeople+person;
    }
    public void ride(double km){
        kms = kms + km;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Rodeózás a 10es úton a kamionok és autók közt egymás mellett", 2021,10,24);
        System.out.println(cyclingTour.description);
        System.out.println(cyclingTour.startTime);
        System.out.println(cyclingTour.numberOfPeople);
        System.out.println(cyclingTour.kms);

        cyclingTour.registerPerson(10);
        cyclingTour.registerPerson(24);

        cyclingTour.ride(20.4);
        cyclingTour.ride(13.3);

        System.out.println(cyclingTour.numberOfPeople);
        System.out.println(cyclingTour.kms);


    }
}
