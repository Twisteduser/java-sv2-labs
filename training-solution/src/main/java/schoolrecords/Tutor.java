package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> subjects= new ArrayList<>();

    public Tutor(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public boolean tutorTeachingSubject(Subject subject){
        boolean teach = false;
        for (Subject s: subjects){
            if (s.getSubjectName().equals(subject.getSubjectName())){
                teach = true;
            }
        }
        return teach;
    }
}
