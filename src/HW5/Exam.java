package HW5;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private int maxValue;
    //@invariant questions != null
    private List<Question> questions;
    private List<Student> students;
    private Course course;

    public Exam(Question question) {
        this.questions = new ArrayList<Question>();
        this.questions.add(question);
    }

    public boolean register(Student student) {
        return this.students.add(student);
    }

    public void addQuestion(int id, String task, int value) {
        this.questions.add(new Question(id, task, value));
    }
}
