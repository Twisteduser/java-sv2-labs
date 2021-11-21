package introexceptionthrow;

public class Adult {
    private String name;
    private int age;

    public Adult(String name, int age) {
        this.name = name;
        if (age<18){
            throw new IllegalArgumentException("Még nem múlt el 18 éves!");
        }

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
