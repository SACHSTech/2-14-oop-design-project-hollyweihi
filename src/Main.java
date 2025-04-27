import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter your Student/Employee ID: ");
        int studentId = Integer.parseInt(keyboard.readLine());

        System.out.println("Please Enter your Name: ");
        String name = keyboard.readLine();

        System.out.println("Please Enter the number of your absend Day: ");
        int absend = Integer.parseInt(keyboard.readLine());

        List <Grade> grades = new ArrayList();

        System.out.println("Please Enter the Number of Course you have: ");
        int numberOfCourse = Integer.parseInt(keyboard.readLine());
        if (numberOfCourse == 1){
            System.out.println("Enter Detail for course");
            System.out.println("Please Enter your course name: ");
            String courseName = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode = keyboard.readLine();

            double totalGrade = 0;
            double grade = 1;
            while(grade != 0){
                System.out.println("Enter the grade(Enter 0 if there are no more grade): ");
                grade = Double.parseDouble(keyboard.readLine());

                totalGrade += grade;
            } 







        } else if (numberOfCourse == 2){
            System.out.println("Please enter Detail for Course 1");
            System.out.println("Please enter Detail for Course 2");
        }else if(numberOfCourse == 3){
            System.out.println("Please enter Detail for Course 1");
            System.out.println("Please enter Detail for Course 2");
            System.out.println("Please enter Detail for Course 3");
        }else if(numberOfCourse == 4){
            System.out.println("Please enter Detail for Course 1");
            System.out.println("Please enter Detail for Course 2");
            System.out.println("Please enter Detail for Course 3");
            System.out.println("Please enter Detail for Course 4");
        }else if(numberOfCourse == 5){
            System.out.println("Please enter Detail for Course 1");
            System.out.println("Please enter Detail for Course 2");
            System.out.println("Please enter Detail for Course 3");
            System.out.println("Please enter Detail for Course 4");
            System.out.println("Please enter Detail for Course 5");
        }else{
            System.out.println("Not possible number of course.");
        }
    }
}
