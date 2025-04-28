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

        // Create List
        List<Grade> grades = new ArrayList();

        // Number of Course
        System.out.println("Please Enter the Number of Course you have: ");
        int numberOfCourse = Integer.parseInt(keyboard.readLine());

        // One course Situation
        if (numberOfCourse == 1) {
            System.out.println("Enter Detail for course");
            System.out.println("Please Enter your course name: ");
            String courseName = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode = keyboard.readLine();

            // Absent number
            System.out.println("Please Enter the number of your absend Day: ");
            int absend = Integer.parseInt(keyboard.readLine());
            if (absend > 4) {
                System.out.println("You are been drop out of the class. ");
            } else if (absend > 3 && absend <= 4) {
                System.out.println("You are almost drop out of this class. ");

                // Average for Course 1;
                double totalGrade = 0;
                double score = 1;
                int numberOfGrade = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade; i++) {
                    System.out.println("Enter the score: ");
                    score = Double.parseDouble(keyboard.readLine());
                    if (score > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score < 0) {
                        System.out.println("It's not a possible score.");
                    }
                    grades.add(new Grade(score, courseName, courseCode));
                    totalGrade += score;
                }

                double average = totalGrade / numberOfGrade;
                System.out.println("Your Average for this course is " + average);
            } else {
                System.out.println(" ");

                double totalGrade = 0;
                double score = 1;
                int numberOfGrade = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade; i++) {
                    System.out.println("Enter the score: ");
                    score = Double.parseDouble(keyboard.readLine());
                    if (score > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score < 0) {
                        System.out.println("It's not a possible score.");
                    }
                    grades.add(new Grade(score, courseName, courseCode));
                    totalGrade += score;

                }
                double average = totalGrade / numberOfGrade;
                System.out.println("Your Average for this course is " + average);
            }

        } else if (numberOfCourse == 2) {
            System.out.println("\n Enter Detail for course 1");
            System.out.println("Please enter cource name");
            String courseName = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode = keyboard.readLine();

            System.out.println("Please Enter the number of your absend Day: ");
            int absend = Integer.parseInt(keyboard.readLine());

            if (absend > 4) {
                System.out.println("You are been drop out of the class. ");
            } else if (absend > 3 && absend <= 4) {
                System.out.println("You are almost drop out of this class. ");

                double totalGrade = 0;
                double score = 1;
                int numberOfGrade = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade; i++) {
                    System.out.println("Enter the score: ");
                    score = Double.parseDouble(keyboard.readLine());
                    if (score > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score < 0) {
                        System.out.println("It's not a possible score.");
                    }
                    grades.add(new Grade(score, courseName, courseCode));
                    totalGrade += score;

                }
                double average = totalGrade / numberOfGrade;
                System.out.println("Your Average for this course is " + average);

            } else {
                System.out.println(" ");

                double totalGrade = 0;
                double score = 1;
                int numberOfGrade = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade; i++) {
                    System.out.println("Enter the score: ");
                    score = Double.parseDouble(keyboard.readLine());
                    if (score > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score < 0) {
                        System.out.println("It's not a possible score.");
                    }
                    grades.add(new Grade(score, courseName, courseCode));
                    totalGrade += score;

                }
                double average = totalGrade / numberOfGrade;
                System.out.println("Your Average for this course is " + average);

            }


                System.out.println("\n Enter Detail for course 2");
                System.out.println("Please Enter your course name");
                String courseName2 = keyboard.readLine();
                System.out.println("Please Enter your course code: ");
                String courseCode2 = keyboard.readLine();

                // Absent Day
                System.out.println("Please Enter the number of your absend Day: ");
                int absend2 = Integer.parseInt(keyboard.readLine());

                //
                if (absend2 > 4) {
                    System.out.println("You are been drop out of the class. ");
                } else if (absend2 > 3 && absend2 <= 4) {
                    System.out.println("You are almost drop out of this class. ");
                    double totalGrade2 = 0;
                    double score2 = 1;
                    int numberOfGrade2 = 0;
                    System.out.println("Please enter the number of grade you have: ");
                    numberOfGrade2 = Integer.parseInt(keyboard.readLine());
                    for (int i = 0; i < numberOfGrade2; i++) {
                        System.out.println("Enter the score: ");
                        score2 = Double.parseDouble(keyboard.readLine());
                        if (score2 > 100) {
                            System.out.println("It's not a possible score.");
                        } else if (score2 < 0) {
                            System.out.println("It's not a possible score.");
                        } else {
                            grades.add(new Grade(score2, courseName2, courseCode2));
                            totalGrade2 += score2;
                        }
                    }
                    double average2 = totalGrade2 / numberOfGrade2;
                    System.out.println("Your Average for this course is " + average2);
                } else {
                    System.out.println(" ");

                    double totalGrade2 = 0;
                    double score2 = 1;
                    int numberOfGrade2 = 0;
                    System.out.println("Please enter the number of grade you have: ");
                    numberOfGrade2 = Integer.parseInt(keyboard.readLine());
                    for (int i = 0; i < numberOfGrade2; i++) {
                        System.out.println("Enter the score: ");
                        score2 = Double.parseDouble(keyboard.readLine());
                        if (score2 > 100) {
                            System.out.println("It's not a possible score.");
                        } else if (score2 < 0) {
                            System.out.println("It's not a possible score.");
                        }else{
                        grades.add(new Grade(score2, courseName2, courseCode2));
                        totalGrade2 += score2;
                    }
                    }
                    double average2 = totalGrade2 / numberOfGrade2;
                    System.out.println("Your Average for this course is " + average2);
                }

        }else if (numberOfCourse == 3){
            System.out.println("Enter Detail for course");
            System.out.println("Please enter Detail for Course 1");
            String courseName = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode = keyboard.readLine();

            System.out.println("Please Enter the number of your absend Day: ");
            int absend = Integer.parseInt(keyboard.readLine());

            if (absend > 4) {
                System.out.println("You are been drop out of the class. ");
            } else if (absend > 3 && absend <= 4) {
                System.out.println("\n Enter Detail for course 1");
            System.out.println("Please enter cource name");
            String courseName1 = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode1 = keyboard.readLine();

            System.out.println("Please Enter the number of your absend Day: ");
            int absend1 = Integer.parseInt(keyboard.readLine());

            if (absend1 > 4) {
                System.out.println("You are been drop out of the class. ");
            } else if (absend1 > 3 && absend1 <= 4) {
                System.out.println("You are almost drop out of this class. ");

                double totalGrade1 = 0;
                double score1 = 1;
                int numberOfGrade1 = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade1 = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade1; i++) {
                    System.out.println("Enter the score: ");
                    score1 = Double.parseDouble(keyboard.readLine());
                    if (score1 > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score1 < 0) {
                        System.out.println("It's not a possible score.");
                    }
                    grades.add(new Grade(score1, courseName, courseCode));
                    totalGrade1 += score1;

                }
                double average1 = totalGrade1 / numberOfGrade1;
                System.out.println("Your Average for this course is " + average1);

            } else {
                System.out.println(" ");

                double totalGrade = 0;
                double score = 1;
                int numberOfGrade = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade; i++) {
                    System.out.println("Enter the score: ");
                    score = Double.parseDouble(keyboard.readLine());
                    if (score > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score < 0) {
                        System.out.println("It's not a possible score.");
                    }
                    grades.add(new Grade(score, courseName, courseCode));
                    totalGrade += score;

                }
                double average = totalGrade / numberOfGrade;
                System.out.println("Your Average for this course is " + average);

            }
        }
                System.out.println("\n Enter Detail for course 2");
                System.out.println("Please Enter your course name");
                String courseName2 = keyboard.readLine();
                System.out.println("Please Enter your course code: ");
                String courseCode2 = keyboard.readLine();

                // Absent Day
                System.out.println("Please Enter the number of your absend Day: ");
                int absend2 = Integer.parseInt(keyboard.readLine());

                //
                if (absend2 > 4) {
                    System.out.println("You are been drop out of the class. ");
                } else if (absend2 > 3 && absend2 <= 4) {
                    System.out.println("You are almost drop out of this class. ");
                    double totalGrade2 = 0;
                    double score2 = 1;
                    int numberOfGrade2 = 0;
                    System.out.println("Please enter the number of grade you have: ");
                    numberOfGrade2 = Integer.parseInt(keyboard.readLine());
                    for (int i = 0; i < numberOfGrade2; i++) {
                        System.out.println("Enter the score: ");
                        score2 = Double.parseDouble(keyboard.readLine());
                        if (score2 > 100) {
                            System.out.println("It's not a possible score.");
                        } else if (score2 < 0) {
                            System.out.println("It's not a possible score.");
                        } else {
                            grades.add(new Grade(score2, courseName2, courseCode2));
                            totalGrade2 += score2;
                        }
                    }
                    double average2 = totalGrade2 / numberOfGrade2;
                    System.out.println("Your Average for this course is " + average2);
                } else {
                    System.out.println(" ");

                    double totalGrade2 = 0;
                    double score2 = 1;
                    int numberOfGrade2 = 0;
                    System.out.println("Please enter the number of grade you have: ");
                    numberOfGrade2 = Integer.parseInt(keyboard.readLine());
                    for (int i = 0; i < numberOfGrade2; i++) {
                        System.out.println("Enter the score: ");
                        score2 = Double.parseDouble(keyboard.readLine());
                        if (score2 > 100) {
                            System.out.println("It's not a possible score.");
                        } else if (score2 < 0) {
                            System.out.println("It's not a possible score.");
                        }
                        grades.add(new Grade(score2, courseName2, courseCode2));
                        totalGrade2 += score2;

                    }
                    double average2 = totalGrade2 / numberOfGrade2;
                    System.out.println("Your Average for this course is " + average2);
                }

                //Course 3
            System.out.println("\n Enter Detail for course 3");
            System.out.println("Please enter Course Name: ");
            String courseName3 = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode3 = keyboard.readLine();

            // Absent Day
            System.out.println("Please Enter the number of your absend Day: ");
            int absend3 = Integer.parseInt(keyboard.readLine());

            //
            if (absend3 > 4) {
                System.out.println("You are been drop out of the class. ");
            } else if (absend3 > 3 || absend3 <= 4) {
                System.out.println("You are almost drop out of this class. ");
                double totalGrade3 = 0;
                double score3 = 1;
                int numberOfGrade3 = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade3 = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade3; i++) {
                    System.out.println("Enter the score: ");
                    score3 = Double.parseDouble(keyboard.readLine());
                    if (score3 > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score3 < 0) {
                        System.out.println("It's not a possible score.");
                    } else {
                        grades.add(new Grade(score3, courseName3, courseCode3));
                        totalGrade3 += score3;
                    }
                }
                double average3 = totalGrade3 / numberOfGrade3;
                System.out.println("Your Average for this course is " + average3);
            }else{
                double totalGrade3 = 0;
                double score3 = 1;
                int numberOfGrade3 = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade3 = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade3; i++) {
                    System.out.println("Enter the score: ");
                    score3 = Double.parseDouble(keyboard.readLine());
                    if (score3 > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score3 < 0) {
                        System.out.println("It's not a possible score.");
                    } else {
                        grades.add(new Grade(score3, courseName3, courseCode3));
                        totalGrade3 += score3;
                    }
                }
                double average3 = totalGrade3 / numberOfGrade3;
                System.out.println("Your Average for this course is " + average3);
            }

        } else if (numberOfCourse == 4) {
            System.out.println("\n Enter Detail for course 1");
            System.out.println("Please enter cource name");
            String courseName = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode = keyboard.readLine();

            System.out.println("Please Enter the number of your absend Day: ");
            int absend = Integer.parseInt(keyboard.readLine());

            if (absend > 4) {
                System.out.println("You are been drop out of the class. ");
            } else if (absend > 3 && absend <= 4) {
                System.out.println("You are almost drop out of this class. ");

                double totalGrade = 0;
                double score = 1;
                int numberOfGrade = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade; i++) {
                    System.out.println("Enter the score: ");
                    score = Double.parseDouble(keyboard.readLine());
                    if (score > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score < 0) {
                        System.out.println("It's not a possible score.");
                    }
                    grades.add(new Grade(score, courseName, courseCode));
                    totalGrade += score;

                }
                double average = totalGrade / numberOfGrade;
                System.out.println("Your Average for this course is " + average);

            } else {
                System.out.println(" ");

                double totalGrade = 0;
                double score = 1;
                int numberOfGrade = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade; i++) {
                    System.out.println("Enter the score: ");
                    score = Double.parseDouble(keyboard.readLine());
                    if (score > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score < 0) {
                        System.out.println("It's not a possible score.");
                    }
                    grades.add(new Grade(score, courseName, courseCode));
                    totalGrade += score;

                }
                double average = totalGrade / numberOfGrade;
                System.out.println("Your Average for this course is " + average);

            }
                System.out.println("\n Enter Detail for course 2");
                System.out.println("Please Enter your course name");
                String courseName2 = keyboard.readLine();
                System.out.println("Please Enter your course code: ");
                String courseCode2 = keyboard.readLine();

                // Absent Day
                System.out.println("Please Enter the number of your absend Day: ");
                int absend2 = Integer.parseInt(keyboard.readLine());

                //
                if (absend2 > 4) {
                    System.out.println("You are been drop out of the class. ");
                } else if (absend2 > 3 && absend2 <= 4) {
                    System.out.println("You are almost drop out of this class. ");
                    double totalGrade2 = 0;
                    double score2 = 1;
                    int numberOfGrade2 = 0;
                    System.out.println("Please enter the number of grade you have: ");
                    numberOfGrade2 = Integer.parseInt(keyboard.readLine());
                    for (int i = 0; i < numberOfGrade2; i++) {
                        System.out.println("Enter the score: ");
                        score2 = Double.parseDouble(keyboard.readLine());
                        if (score2 > 100) {
                            System.out.println("It's not a possible score.");
                        } else if (score2 < 0) {
                            System.out.println("It's not a possible score.");
                        } else {
                            grades.add(new Grade(score2, courseName2, courseCode2));
                            totalGrade2 += score2;
                        }
                    }
                    double average2 = totalGrade2 / numberOfGrade2;
                    System.out.println("Your Average for this course is " + average2);
                } else {
                    System.out.println(" ");

                    double totalGrade2 = 0;
                    double score2 = 1;
                    int numberOfGrade2 = 0;
                    System.out.println("Please enter the number of grade you have: ");
                    numberOfGrade2 = Integer.parseInt(keyboard.readLine());
                    for (int i = 0; i < numberOfGrade2; i++) {
                        System.out.println("Enter the score: ");
                        score2 = Double.parseDouble(keyboard.readLine());
                        if (score2 > 100) {
                            System.out.println("It's not a possible score.");
                        } else if (score2 < 0) {
                            System.out.println("It's not a possible score.");
                        }
                        grades.add(new Grade(score2, courseName2, courseCode2));
                        totalGrade2 += score2;

                    }
                    double average2 = totalGrade2 / numberOfGrade2;
                    System.out.println("Your Average for this course is " + average2);
                }

                //Course 3
            System.out.println("\n Enter Detail for course 3");
            System.out.println("Please enter Course Name: ");
            String courseName3 = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode3 = keyboard.readLine();

            // Absent Day
            System.out.println("Please Enter the number of your absend Day: ");
            int absend3 = Integer.parseInt(keyboard.readLine());

            //
            if (absend3 > 4) {
                System.out.println("You are been drop out of the class. ");
            } else if (absend3 > 3 || absend3 <= 4) {
                System.out.println("You are almost drop out of this class. ");
                double totalGrade3 = 0;
                double score3 = 1;
                int numberOfGrade3 = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade3 = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade3; i++) {
                    System.out.println("Enter the score: ");
                    score3 = Double.parseDouble(keyboard.readLine());
                    if (score3 > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score3 < 0) {
                        System.out.println("It's not a possible score.");
                    } else {
                        grades.add(new Grade(score3, courseName3, courseCode3));
                        totalGrade3 += score3;
                    }
                }
                double average3 = totalGrade3 / numberOfGrade3;
                System.out.println("Your Average for this course is " + average3);
            }else{
                double totalGrade3 = 0;
                double score3 = 1;
                int numberOfGrade3 = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade3 = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade3; i++) {
                    System.out.println("Enter the score: ");
                    score3 = Double.parseDouble(keyboard.readLine());
                    if (score3 > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score3 < 0) {
                        System.out.println("It's not a possible score.");
                    } else {
                        grades.add(new Grade(score3, courseName3, courseCode3));
                        totalGrade3 += score3;
                    }
                }
                double average3 = totalGrade3 / numberOfGrade3;
                System.out.println("Your Average for this course is " + average3);
            }

            System.out.println("\n Enter Detail for course 4");
            System.out.println("Please enter Course Name: ");
            String courseName4 = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode4 = keyboard.readLine();

            // Absent Day
            System.out.println("Please Enter the number of your absend Day: ");
            int absend4 = Integer.parseInt(keyboard.readLine());

            //
            if (absend4 > 4) {
                System.out.println("You are been drop out of the class. ");
            } else if (absend4 > 3 || absend4 <= 4) {
                System.out.println("You are almost drop out of this class. ");
                double totalGrade4 = 0;
                double score4 = 1;
                int numberOfGrade4 = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade4 = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade4; i++) {
                    System.out.println("Enter the score: ");
                    score4 = Double.parseDouble(keyboard.readLine());
                    if (score4 > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score4 < 0) {
                        System.out.println("It's not a possible score.");
                    } else {
                        grades.add(new Grade(score4, courseName4, courseCode4));
                        totalGrade4 += score4;
                    }
                }
                double average4 = totalGrade4 / numberOfGrade4;
                System.out.println("Your Average for this course is " + average4);
            } else {
                double totalGrade4 = 0;
                double score4 = 1;
                int numberOfGrade4 = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade4 = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade4; i++) {
                    System.out.println("Enter the score: ");
                    score4 = Double.parseDouble(keyboard.readLine());
                    if (score4 > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score4 < 0) {
                        System.out.println("It's not a possible score.");
                    } else {
                        grades.add(new Grade(score4, courseName4, courseCode4));
                        totalGrade4 += score4;
                    }
                double average4 = totalGrade4 / numberOfGrade4;
                System.out.println("Your Average for this course is " + average4);
                }
            }

        } else if (numberOfCourse == 5) {
            System.out.println("\n Enter Detail for course 1");
            System.out.println("Please enter cource name");
            String courseName = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode = keyboard.readLine();

            System.out.println("Please Enter the number of your absend Day: ");
            int absend = Integer.parseInt(keyboard.readLine());

            if (absend > 4) {
                System.out.println("You are been drop out of the class. ");
            } else if (absend > 3 && absend <= 4) {
                System.out.println("You are almost drop out of this class. ");

                double totalGrade = 0;
                double score = 1;
                int numberOfGrade = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade; i++) {
                    System.out.println("Enter the score: ");
                    score = Double.parseDouble(keyboard.readLine());
                    if (score > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score < 0) {
                        System.out.println("It's not a possible score.");
                    }
                    grades.add(new Grade(score, courseName, courseCode));
                    totalGrade += score;

                }
                double average = totalGrade / numberOfGrade;
                System.out.println("Your Average for this course is " + average);

            } else {
                System.out.println(" ");

                double totalGrade = 0;
                double score = 1;
                int numberOfGrade = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade; i++) {
                    System.out.println("Enter the score: ");
                    score = Double.parseDouble(keyboard.readLine());
                    if (score > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score < 0) {
                        System.out.println("It's not a possible score.");
                    }
                    grades.add(new Grade(score, courseName, courseCode));
                    totalGrade += score;

                }
                double average = totalGrade / numberOfGrade;
                System.out.println("Your Average for this course is " + average);

            }
        }
                System.out.println("\n Enter Detail for course 2");
                System.out.println("Please Enter your course name");
                String courseName2 = keyboard.readLine();
                System.out.println("Please Enter your course code: ");
                String courseCode2 = keyboard.readLine();

                // Absent Day
                System.out.println("Please Enter the number of your absend Day: ");
                int absend2 = Integer.parseInt(keyboard.readLine());

                //
                if (absend2 > 4) {
                    System.out.println("You are been drop out of the class. ");
                } else if (absend2 > 3 && absend2 <= 4) {
                    System.out.println("You are almost drop out of this class. ");
                    double totalGrade2 = 0;
                    double score2 = 1;
                    int numberOfGrade2 = 0;
                    System.out.println("Please enter the number of grade you have: ");
                    numberOfGrade2 = Integer.parseInt(keyboard.readLine());
                    for (int i = 0; i < numberOfGrade2; i++) {
                        System.out.println("Enter the score: ");
                        score2 = Double.parseDouble(keyboard.readLine());
                        if (score2 > 100) {
                            System.out.println("It's not a possible score.");
                        } else if (score2 < 0) {
                            System.out.println("It's not a possible score.");
                        } else {
                            grades.add(new Grade(score2, courseName2, courseCode2));
                            totalGrade2 += score2;
                        }
                    }
                    double average2 = totalGrade2 / numberOfGrade2;
                    System.out.println("Your Average for this course is " + average2);
                } else {
                    System.out.println(" ");

                    double totalGrade2 = 0;
                    double score2 = 1;
                    int numberOfGrade2 = 0;
                    System.out.println("Please enter the number of grade you have: ");
                    numberOfGrade2 = Integer.parseInt(keyboard.readLine());
                    for (int i = 0; i < numberOfGrade2; i++) {
                        System.out.println("Enter the score: ");
                        score2 = Double.parseDouble(keyboard.readLine());
                        if (score2 > 100) {
                            System.out.println("It's not a possible score.");
                        } else if (score2 < 0) {
                            System.out.println("It's not a possible score.");
                        }
                        grades.add(new Grade(score2, courseName2, courseCode2));
                        totalGrade2 += score2;

                    }
                    double average2 = totalGrade2 / numberOfGrade2;
                    System.out.println("Your Average for this course is " + average2);
                }

                //Course 3
            System.out.println("\n Enter Detail for course 3");
            System.out.println("Please enter Course Name: ");
            String courseName3 = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode3 = keyboard.readLine();

            // Absent Day
            System.out.println("Please Enter the number of your absend Day: ");
            int absend3 = Integer.parseInt(keyboard.readLine());

            //
            if (absend3 > 4) {
                System.out.println("You are been drop out of the class. ");
            } else if (absend3 > 3 || absend3 <= 4) {
                System.out.println("You are almost drop out of this class. ");
                double totalGrade3 = 0;
                double score3 = 1;
                int numberOfGrade3 = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade3 = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade3; i++) {
                    System.out.println("Enter the score: ");
                    score3 = Double.parseDouble(keyboard.readLine());
                    if (score3 > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score3 < 0) {
                        System.out.println("It's not a possible score.");
                    } else {
                        grades.add(new Grade(score3, courseName3, courseCode3));
                        totalGrade3 += score3;
                    }
                }
                double average3 = totalGrade3 / numberOfGrade3;
                System.out.println("Your Average for this course is " + average3);
            }else{
                double totalGrade3 = 0;
                double score3 = 1;
                int numberOfGrade3 = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade3 = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade3; i++) {
                    System.out.println("Enter the score: ");
                    score3 = Double.parseDouble(keyboard.readLine());
                    if (score3 > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score3 < 0) {
                        System.out.println("It's not a possible score.");
                    } else {
                        grades.add(new Grade(score3, courseName3, courseCode3));
                        totalGrade3 += score3;
                    }
                }
                double average3 = totalGrade3 / numberOfGrade3;
                System.out.println("Your Average for this course is " + average3);
            }

            System.out.println("\n Enter Detail for course 4");
            System.out.println("Please enter Course Name: ");
            String courseName4 = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode4 = keyboard.readLine();

            // Absent Day
            System.out.println("Please Enter the number of your absend Day: ");
            int absend4 = Integer.parseInt(keyboard.readLine());

            //
            if (absend4 > 4) {
                System.out.println("You are been drop out of the class. ");
            } else if (absend4 > 3 || absend4 <= 4) {
                System.out.println("You are almost drop out of this class. ");
                double totalGrade4 = 0;
                double score4 = 1;
                int numberOfGrade4 = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade4 = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade4; i++) {
                    System.out.println("Enter the score: ");
                    score4 = Double.parseDouble(keyboard.readLine());
                    if (score4 > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score4 < 0) {
                        System.out.println("It's not a possible score.");
                    } else {
                        grades.add(new Grade(score4, courseName4, courseCode4));
                        totalGrade4 += score4;
                    }
                }
                double average4 = totalGrade4 / numberOfGrade4;
                System.out.println("Your Average for this course is " + average4);
            } else {
                double totalGrade4 = 0;
                double score4 = 1;
                int numberOfGrade4 = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade4 = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade4; i++) {
                    System.out.println("Enter the score: ");
                    score4 = Double.parseDouble(keyboard.readLine());
                    if (score4 > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score4 < 0) {
                        System.out.println("It's not a possible score.");
                    } else {
                        grades.add(new Grade(score4, courseName4, courseCode4));
                        totalGrade4 += score4;
                    }
                }
                double average4 = totalGrade4 / numberOfGrade4;
                System.out.println("Your Average for this course is " + average4);
            }

            System.out.println("\n Enter Detail for course 5");
            System.out.println("Please enter Course Name: ");
            String courseName5 = keyboard.readLine();
            System.out.println("Please Enter your course code: ");
            String courseCode5 = keyboard.readLine();

            // Absent Day
            System.out.println("Please Enter the number of your absend Day: ");
            int absend5 = Integer.parseInt(keyboard.readLine());

            //
            if (absend5 > 4) {
                System.out.println("You are been drop out of the class. ");
            } else if (absend5 > 3 && absend5 <= 4) {
                System.out.println("You are almost drop out of this class. ");
                double totalGrade5 = 0;
                double score5 = 1;
                int numberOfGrade5 = 0;
                System.out.println("Please enter the number of grade you have: ");
                numberOfGrade5 = Integer.parseInt(keyboard.readLine());
                for (int i = 0; i < numberOfGrade5; i++) {
                    System.out.println("Enter the score: ");
                    score5 = Double.parseDouble(keyboard.readLine());
                    if (score5 > 100) {
                        System.out.println("It's not a possible score.");
                    } else if (score5 < 0) {
                        System.out.println("It's not a possible score.");
                    } else {
                        grades.add(new Grade(score5, courseName5, courseCode5));
                        totalGrade5 += score5;
                    }
                }
                double average5 = totalGrade5 / numberOfGrade5;
                System.out.println("Your Average for this course is " + average5);
            }
        }
}