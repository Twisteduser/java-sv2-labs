package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("School",1);
        School primarySchool = new PrimarySchool("Primary", 2);
        School secondarySchool = new SecondarySchool("Secondary", 3);

        System.out.println(school.toString());
        System.out.println(primarySchool.toString());
        System.out.println(secondarySchool.toString());
    }
}
