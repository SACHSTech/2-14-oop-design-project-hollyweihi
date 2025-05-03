import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // User input
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Are you a student or teacher (S/T): ");
        String user = keyboard.readLine();

        if(user.equals("T")){
            System.out.println("Please enter your Employee ID (6 digit): ");
            int employeeID = Integer.parseInt(keyboard.readLine());

            System.out.println("Please Enter your Department: ");
            String department = keyboard.readLine();

            System.out.println("How many courses do you teach? ");
            int numCourses = Integer.parseInt(keyboard.readLine());
        }

        // Enter ID
        System.out.println("Please Enter your Student ID (6 digit): ");
        int studentId = Integer.parseInt(keyboard.readLine());

        // Enter Name
        System.out.println("Please Enter your Name: ");
        String name = keyboard.readLine();

        int numberOfCourse = 0;
        while (true) {
            System.out.println("How many course do you have: ");
            numberOfCourse = Integer.parseInt(keyboard.readLine());

            if (numberOfCourse >= 1 && numberOfCourse <= 5) {
                break;
            } else {
                System.out.println("This is not a possible number of course.");
            }
        }

        // Create List
        Student student = new Student(name, studentId, new ArrayList<>());
        double totalWeight = 0;

        for (int i = 0; i < numberOfCourse; i++) {
            totalWeight = 0;
            double totalGrade = 0;
            double score = 1;
            double weights = 0;
            // Ask detail
            System.out.println("\nEnter Detail for course " + (i + 1));
            System.out.println("Please Enter your course name: ");
            String courseName = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode = keyboard.readLine();

            System.out.println("Please Enter the number of absent: ");
            int absent = Integer.parseInt(keyboard.readLine());

            if (absent > 4) {
                System.out.println("You've been kick out of the class.");

            } else {
                System.out.println("You are in the class.");

                int numberOfGrade = 0;

                // ask for number of grade
                System.out.println("\nPlease enter the number of grade you have: ");
                numberOfGrade = Integer.parseInt(keyboard.readLine());

                // Create Array List
                List<Double> scores = new ArrayList();

                for (int a = 0; a < numberOfGrade; a++) {

                    System.out.println("Enter the score: ");
                    score = Double.parseDouble(keyboard.readLine());
                    if (score > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score < 0) {
                        System.out.println("It's not a possible score.");
                    } else {

                        System.out.println("Enter the weight of this score (in %): ");
                        weights = Double.parseDouble(keyboard.readLine());
                        totalWeight += weights;
                        totalGrade = score * (weights / 100);
                        scores.add(totalGrade);
                    }
                }

                student. getGrades().add(new Grade(scores, courseName, courseCode, totalWeight));
            }
        }
        // Summary

        System.out.println();
        System.out.println("Student Info: ");
        System.out.println("Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentID());

        // Average
        System.out.println();
        System.out.println("Course Grade: ");
        for (int i = 0; i < student. getGrades().size(); i++) {
            Grade grade = student.getGrades().get(i);
            System.out.println("\n" + grade.getCourseName());
            System.out.println("Average: " + grade.getAverageScore());
            System.out.println("GPA: " + grade.getGPA());
            System.out.println("Letter Grade: " + grade.getLetterGrade());
            System.out.println("Level Grade: " + grade.getLevelGrade());
        }
    }
}