package HW5;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Employee{
    private List<Course> courses;
    private List<Exam> exams;

    public Professor(Course course, Department department) {
        super(department);
        this.courses = new ArrayList<Course>();
        this.courses.add(course);
    }

    public void publicCourse() {

    }

    public void assignTA() {

    }

    public void addCourse() {

    }

}
