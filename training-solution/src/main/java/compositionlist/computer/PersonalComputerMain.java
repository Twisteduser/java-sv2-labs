package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("AMD Ryzen 5",3.6);
        PersonalComputer personalComputer = new PersonalComputer(cpu);

        Hardware ssd = new Hardware("SSD", "Samssung 870 evo");
        Hardware vga = new Hardware("VGA","GeForce 1660 OC ");
        personalComputer.addHardware(ssd);
        personalComputer.addHardware(vga);
        Software opSystem = new Software("Windows",10);
        Software browser = new Software("Opera GX",80);
        personalComputer.addSoftware(opSystem);
        personalComputer.addSoftware(browser);

        System.out.println(personalComputer.getCpu());
        System.out.println(personalComputer.getHardwares());
        System.out.println(personalComputer.getSoftwares());

        System.out.println(personalComputer);

    }
}
