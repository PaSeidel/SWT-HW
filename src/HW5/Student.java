package HW5;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private Project project;
    private List<Course> courses;

    public Student(Course course) {
        this.courses = new ArrayList<Course>();
        this.courses.add(course);
    }

    public String getName() {
        return this.name;
    }

    public Project getProject() {
        return this.project;
    }

}
