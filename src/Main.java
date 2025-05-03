import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<Teacher> teachers = new ArrayList();
    private static List<Student> students = new ArrayList();

    public static void main(String[] args) throws IOException {
        Teacher mathTeacher = new Teacher("Mr. Smith", 100001, "Math");
        Teacher scienceTeacher = new Teacher("Dr. Johnson", 100002, "Science");
        teachers.add(mathTeacher);
        teachers.add(scienceTeacher);

        Student student1 = new Student("Holly", 333333);
        Student student2 = new Student("Bob", 200002);
        students.add(student1);
        students.add(student2);

        mathTeacher.addCourse("MDM4U");
        scienceTeacher.addCourse("SBI4U");

        System.out.println("Teachers");
        System.out.println(mathTeacher);
        System.out.println(scienceTeacher);

        System.out.println("Students");
        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            System.out.println(student);            
        }
    }
}