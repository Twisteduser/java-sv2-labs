package packages.namemain;

import packages.prefix.Prefix;
import packages.firstname.FirstName;
import packages.lastname.LastName;

public class NameMain {
    public static void main(String[] args) {
        Prefix prefix = new Prefix("Dr");
        FirstName firstName = new FirstName("Sheldon");
        LastName lastName = new LastName("Cooper");

        String fullname = prefix.getPre() + " " + firstName.getFirst() + " " + lastName.getLast();
        System.out.println(fullname);
    }
}
