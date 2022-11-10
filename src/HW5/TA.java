package HW5;

import java.util.ArrayList;
import java.util.List;

public class TA extends Employee{
    private List<Course> courses;
    private List<Exam> exams;

    public TA(Course course, Exam exam, Department department) {
        super(department);
        this.courses = new ArrayList<Course>();
        this.exams = new ArrayList<Exam>();
        this.courses.add(course);
        this.exams.add(exam);
        this.name = "unnamed";
    }

    public List<Course> getCourse() {
        return this.courses;
    }

    public String getName() {
        return this.name;
    }
}
