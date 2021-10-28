package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        Person person2 = person1;

        person2.setName("Ív Béla");

        System.out.println(person1);
        System.out.println(person2);

        int variable1 = 24;
        int variable2 = variable1;
        variable2 = variable2+1;

        System.out.println(variable1);
        System.out.println(variable2);

        Person person3 = new Person("Új Felhasználó", 40);
        person2 = person3;
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
