package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("John Wick","IDDQDD");

        Address address = new Address("Hungary","Budapest","Fő út 1.","1111");
        person.moveTo(address);

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("Jack Wick","QWERTZU");
        System.out.println(person.personToString());

        person.getAddress().correctData("USA", "Los Angeles", "Main street 1","A15D26");
        System.out.println(person.getAddress().addressToString());


    }
}
