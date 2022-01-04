package schoolrecords;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public Random getRandom() {
        return random;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean addStudent(Student student) {
        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        for (Student s : students) {
            if (s.getName().equals(student.getName())) {
                students.remove(s);
                return true;
            }
        }
        return false;
    }

    public double calculateClassAverage() {
        double ave = 0;
        for (Student student : students) {
            ave += student.calculateAverage();
        }
        if (!students.isEmpty()) {
            if (ave / students.size() != 0) {
                return ave / students.size();
            } else {
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
        } else {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double ave = 0;
        int count = 0;
        for (Student student : students) {
            if (student.calculateSubjectAverage(subject) != 0.0) {
                ave += student.calculateSubjectAverage(subject);
                count++;
            }
        }
        if (!students.isEmpty()) {
            return ave / count;
        } else {
            return 0.0;
        }
    }

    public Student findStudentByName(String name){
        if (name.isEmpty()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.isEmpty()){
            throw new IllegalStateException("No students to search!");
        }
        for (Student s: students){
            if (s.getName().equals(name)){
                return s;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition(){
        if (students.isEmpty()){
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(random.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> studyResultByNames = new ArrayList<>();
        for (Student student : students) {
            studyResultByNames.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return studyResultByNames;
    }
    public String listStudentNames() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bool = true;
        for (Student student : students) {
            if (bool) {
                bool = false;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(student.getName());
        }
        return String.valueOf(stringBuilder);
    }
}
