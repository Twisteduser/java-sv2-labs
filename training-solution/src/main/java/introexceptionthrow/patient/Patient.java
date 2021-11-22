package introexceptionthrow.patient;
public class Patient {
    public static final int MIN_YEAR = 1900;
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int yearOfBirth) {
        if (name.equals(null) || name.isEmpty()){
            throw new IllegalArgumentException("A név nem lehet üres");
        }
        if (yearOfBirth<=MIN_YEAR){
            throw new IllegalArgumentException("Hibás születési év: "+yearOfBirth);
        }
        if (!new SsnValidator().isValidSsn(ssn))
            throw new IllegalArgumentException("Érvénytelen TAJ szám: "+ssn);
        this.name = name;
        this.socialSecurityNumber = ssn;
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
        Patient patient = new Patient("Beteg Béla","011111111",1970);
        System.out.println(patient.getName());
        System.out.println(patient.getYearOfBirth());
        System.out.println(patient.getSocialSecurityNumber());

        Patient patient2 = new Patient("F","978654321",1901);
        System.out.println(patient2.getName());
        System.out.println(patient2.getYearOfBirth());
        System.out.println(patient2.getSocialSecurityNumber());

        Patient patient3 = new Patient("Beteg Barna","987456321",1980);
        System.out.println(patient3.getName());
        System.out.println(patient3.getYearOfBirth());
        System.out.println(patient3.getSocialSecurityNumber());
    }
}
