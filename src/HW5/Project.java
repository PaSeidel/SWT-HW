package HW5;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private List<Student> members;
    private Course course;
    private Project project;

    public Project(Course course) {
        this.course = course;
        this.members = new ArrayList<Student>();
        this.project = null;
    }

    public Project(Course course, Project project) {
        this.course = course;
        this.members = new ArrayList<Student>();
        this.project = project;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addMember(Student student) {
        this.members.add(student);
    }
}
