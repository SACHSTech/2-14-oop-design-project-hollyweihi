import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int studentId;
    private List<Grade> grades;

    /**
     * Construct a new student.
     * 
     * @param name      The name of a student
     * @param studentId The student ID of a student
     * @param grades    The grade that student have
     * 
     * @author Holly Wei
     */

    public Student(String name, int studentId, List<Grade> grades) {
        super(name);
        this.studentId = studentId;
        this.grades = new ArrayList();
    }

    /**
     * Return student ID.
     * 
     * @return student ID
     */
    public int getStudentID() {
        return studentId;
    }

    /**
     * Return student's grade.
     * 
     * @return the grades
     */
    public List<Grade> getGrades() {
        return grades;
    }

    /**
     * Calculate the student average.
     * 
     * @return average
     */
    public double getAverage() {
        double totalGrade = 0.00;

        for (int i = 0; i < grades.size(); i++) {
            totalGrade += grades.get(i).getAverageScore();
        }

        double average = totalGrade / grades.size();

        return average;
    }
}
