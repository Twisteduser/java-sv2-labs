package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl =new IntroControl();
        System.out.println("subtractTenIfGreaterThanTen\n" + introControl.subtractTenIfGreaterThanTen(12));
        System.out.println("describeNumber\n" + introControl.describeNumber(2));
        System.out.println("greetingToJoe\n" + introControl.greetingToJoe("Joe"));
        System.out.println("calculateBonus\n" + introControl.calculateBonus(2000000));
        System.out.println("calculateConsumption\n" + introControl.calculateConsumption(9998,2));

        System.out.println("printNumbers");
        introControl.printNumbers(20);
        System.out.println("printNumbersBetween");
        introControl.printNumbersBetween(6,20);
        System.out.println("printNumbersBetweenAnyDirection");
        introControl.printNumbersBetweenAnyDirection(20,10);
        System.out.println("printOddNumbers");
        introControl.printOddNumbers(17);
    }
}
