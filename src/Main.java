import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Teacher mathTeacher = new Teacher("Mr.Smith", 100001, "Math");
        Teacher scienceTeacher = new Teacher("Dr. Johnson", 100002, "Science");

        Student student1 = new Student("Holly", 333333);
        Student student2 = new Student("Bob", 200002);

        mathTeacher.addCourse("MDM4U");
        scienceTeacher.addCourse("SBI4U");

        System.out.println("Teachers");
        System.out.println(mathTeacher);
        System.out.println(scienceTeacher);

        
    }
}