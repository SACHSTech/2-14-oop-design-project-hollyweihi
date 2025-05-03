import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private int employeeId;
    private String department;
    private List<String> courseTeaching;

    /**
     * Construct a new teacher.
     * 
     * @param name           The name of teacher
     * @param employeeId     The employee ID of a teacher
     * @param department     The department of teacher
     * @param courseTeaching The courses that a teacher have
     * 
     * @author Holly Wei
     */

    public Teacher(String name, int employeeId, String department, List<String> courseTeaching) {
        super(name);
        this.employeeId = employeeId;
        this.department = department;
        this.courseTeaching = new ArrayList<>();
    }

    /**
     * Return the employee id.
     * 
     * @return employee id
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Return the department of the teacher.
     * 
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Return the course that a teacher teach.
     * 
     * @return course teaching by a teacher
     */
    public List<String> getCoursesTeaching() {
        return courseTeaching;
    }

    /**
     * Adding a course to a list of course.
     * 
     * @param courseCode The course code of a course.
     */
    public void addCourse(String courseCode) {
        if (!courseTeaching.contains(courseCode)) {
            courseTeaching.add(courseCode);
        }
    }

    public String toString() {
        return "Teacher: " + getName() + "(" + getEmployeeId() + ") have " + getCoursesTeaching();
    }
}
