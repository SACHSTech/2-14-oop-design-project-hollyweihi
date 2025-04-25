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

    public String getDrop(){
        String answer = "";
        if (getAbsent() > 4){
            answer = "You've been kick out of the class.";
            return answer;
        } else {
            answer = "You are in the class.";
            return answer;
        }
    }
}
