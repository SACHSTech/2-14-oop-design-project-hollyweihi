import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private int employeeId;
    private String department;
    private List<String> courseTeaching;

    public Teacher(String name, int employeeId, String department, List<String> courseTeaching) {
        super(name);
        this.employeeId = employeeId;
        this.department = department;
        this.courseTeaching = new ArrayList<>();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment(){
        return department;
    }

    public List<String> getCoursesTeaching(){
        return courseTeaching;
    }

    public void addCourse(String courseCode){
        if(!courseTeaching.contains(courseCode)){
            courseTeaching.add(courseCode);
        }
    }

    public String toString(){
        return "Teacher: " + getName() + "(" + getEmployeeId() + ") have " + getCoursesTeaching(); 
    }
}
