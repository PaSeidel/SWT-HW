package HW5;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private int maxCapacity;
    private boolean isFull;
    private Professor[] profs;
    private List<Student> students;

    public Course(int id, String name, int cap, Professor prof) {
        this.id = id;
        this.name = name;
        this.maxCapacity = cap;
        this.profs = new Professor[3];
        this.profs[0] = prof;
        this.students = new ArrayList<Student>();
    }

    public void enroll(Student student) {

    }

    public void apply(TA ta) {

    }
    
    // Test comment for Sonar Lint
    public void setMaxCap(int max) {
        this.maxCapacity = max;
    }
}
