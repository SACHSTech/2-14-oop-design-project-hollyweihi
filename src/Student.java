public class Student extends Person{
    private int studentId;
    private int absent;

    public Student(String name, int studentId, int absent){
        super(name);
        this.studentId = studentId;
        this.absent = absent;
    }

    public int getStudentID(){
        return studentId;
    }

    public int getAbsent(){
        return absent;
    }
}
