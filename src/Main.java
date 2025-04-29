import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // User input
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Enter ID
        System.out.println("Please Enter your Student/Employee ID (6 digit): ");
        int studentId = Integer.parseInt(keyboard.readLine());

        // Enter Name
        System.out.println("Please Enter your Name: ");
        String name = keyboard.readLine();

        System.out.println("Please Enter the number of absent: ");
        int absent = Integer.parseInt(keyboard.readLine());

        int numberOfCourse = 0;
        while(true){
            System.out.print("How many course do you have: ");
            numberOfCourse = Integer.parseInt(keyboard.readLine());

            if(numberOfCourse >= 1 && numberOfCourse <= 5){
                break;
            }else{
                System.out.println("This is not a possible number of course.");
            }
        }

        // Create List
        List<Grade> grades = new ArrayList();

        // Ask detail
        System.out.println("\nEnter Detail for course");
        System.out.println("Please Enter your course name: ");
        String courseName = keyboard.readLine();
        System.out.println("Please Enter your course code: ");
        String courseCode = keyboard.readLine();

        // Ask Score
        double totalGrade = 0;
        double score = 1;
        int numberOfGrade = 0;

        // ask for number of grade
        System.out.println("Please enter the number of grade you have: ");
        numberOfGrade = Integer.parseInt(keyboard.readLine());

        // Create Array List
        List<Double> scores = new ArrayList();

        for (int i = 0; i < numberOfGrade; i++) {
            System.out.println("Enter the score: ");
            score = Double.parseDouble(keyboard.readLine());
            if (score > 100) {
                System.out.println("It's not a possible score.");
            } else if (score < 0) {
                System.out.println("It's not a possible score.");
            }
            scores.add(score);
        }

        grades.add(new Grade(scores, courseName, courseCode));

        Student student = new Student(name, studentId, grades, absent);
        System.out.println();

        System.out.println("Your Average for this course is " + student.getAverage());

        // Summary

        System.out.println();
        System.out.println("Student Info: ");
        System.out.println("Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Absences: " + student.getAbsent());
        System.out.println(student.getDrop());
    }
}