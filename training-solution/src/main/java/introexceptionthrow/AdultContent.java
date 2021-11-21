package introexceptionthrow;

public class AdultContent {


    public static void main(String[] args) {
        Adult adult = new Adult("John Wick", 21);
        System.out.println(adult.getName());
        System.out.println(adult.getAge());

        Adult adult2 = new Adult("John Doe", 11);
        System.out.println(adult2.getName());
        System.out.println(adult2.getAge());
    }
}
