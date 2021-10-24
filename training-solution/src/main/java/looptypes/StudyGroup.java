package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public void printStudyGroups(List<String> students) {
        for (String s : students) {
            if (s.length() <= 10) {
                System.out.println(s + ": 1-es csoport");
            } else {
                System.out.println(s + ": 2-es csoport");
            }
        }
    }
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Kiváncsi Fáncsi", "Zöldes Barna", "Sárgás Lilla", "Kiss Virág", "Nagy Sándor", "John Doe");
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(students);
    }
}