package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Budapest", "1115", "Fehérvári út",1);
        System.out.println(address);

        Details details = new Details("Zajos, meleg 9. emeleti lakás", address, 50,0);
        System.out.println(details);

        RealEstate realEstate = new RealEstate("9. emeleti lakás", 60,details);
        System.out.println(realEstate);
    }
}
