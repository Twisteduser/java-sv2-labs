package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Demo User");
        client.setYear(1990);
        client.setAddress("Budapest, fő utca 1.");

        System.out.println("Name: " + client.getName());
        System.out.println("Birth date: " + client.getYear());
        System.out.println("Address :" + client.getAddress());

        client.migrate("Esztergom, Suzuki út 1.");
        System.out.println("New address: " + client.getAddress());
    }

}
