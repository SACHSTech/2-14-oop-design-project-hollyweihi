import java.util.List;

public class Student extends Person {
    private int studentId;
    private int absent;
    private List<Grade> grades;

    public Student(String name, int studentId, List<Grade> grades) {
        super(name);
        this.studentId = studentId;
        this.absent = absent;
        this.grades = grades;
    }

    public int getStudentID() {
        return studentId;
    }

    public int getAbsent() {
        return absent;
    }

    public Boolean getDrop() {
        return getAbsent() > 4;
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
