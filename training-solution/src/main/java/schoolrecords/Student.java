package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (name.isEmpty()){ throw new IllegalArgumentException("Student name must not be empty!");}
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void grading(Mark mark){
        if(mark==null){
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }
}
