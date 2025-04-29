public class Teacher extends Person {
    private int employeeId;

    public Teacher(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
