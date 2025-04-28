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
            double score = 1;
            int numberOfGrade = 0;
            System.out.println("Please enter the number of grade you have: ");
            numberOfGrade = Integer.parseInt(keyboard.readLine());
            for(int i = 0; i < numberOfGrade; i++){
                System.out.println("Enter the score: ");
                score = Double.parseDouble(keyboard.readLine());
                if(score > 100){
                    System.out.println("It's not a possible score.");
                } else if (score < 0){
                    System.out.println("It's not a possible score.");
                }
                grades.add(new Grade(score, courseName, courseCode));
                totalGrade += score;

                
            }
            double average = totalGrade/numberOfGrade;
            System.out.println("Your Average for this course is " + average);





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
