import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int studentId;
    private List<Grade> grades;

    public Student(String name, int studentId, List<Grade> grades) {
        super(name);
        this.studentId = studentId;
        this.grades = new ArrayList();
    }

    public int getStudentID() {
        return studentId;
    }

    public List<Grade> getGrades(){
        return grades;
    }

    public double getAverage() {
        double totalGrade = 0.00;

        for (int i = 0; i < grades.size(); i++) {
            totalGrade += grades.get(i).getAverageScore();
        }

        double average = totalGrade / grades.size();

        return average;
    }
}
