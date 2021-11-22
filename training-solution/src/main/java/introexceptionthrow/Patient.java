package introexceptionthrow;

public class Patient {
    public static final int MIN_YEAR = 1900;
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name.equals(null) || name.isEmpty()){
            throw new IllegalArgumentException("A név nem lehet üres");
        }
        if (yearOfBirth<=MIN_YEAR){
            throw new IllegalArgumentException("Hibás születési év: "+yearOfBirth);
        }
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient patient = new Patient("Beteg Béla","123456789",1970);
        System.out.println(patient.getName());
        System.out.println(patient.getYearOfBirth());
        System.out.println(patient.getSocialSecurityNumber());

        Patient patient2 = new Patient("","978654321",1901);
        System.out.println(patient2.getName());
        System.out.println(patient2.getYearOfBirth());
        System.out.println(patient2.getSocialSecurityNumber());

        Patient patient3 = new Patient("Beteg Barna","654987321",1899);
        System.out.println(patient3.getName());
        System.out.println(patient3.getYearOfBirth());
        System.out.println(patient3.getSocialSecurityNumber());
    }
}
