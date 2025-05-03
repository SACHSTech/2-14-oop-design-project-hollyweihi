import java.util.List;

public class Grade {
    private List<Double> scores;
    private String courseName;
    private String courseId;
    private double totalWeight;

    /**
     * Construct a new Grade.
     * 
     * @param scores      The student's test score
     * @param courseName  The course name of a student
     * @param courseId    The course code/ID of a course
     * @param totalWeight The total weight of each score
     * 
     * @author Holly Wei
     */

    public Grade(List<Double> scores, String courseName, String courseId, double totalWeight) {
        this.scores = scores;
        this.courseName = courseName;
        this.courseId = courseId;
        this.totalWeight = totalWeight;
    }

    /**
     * Retrun Student's test score.
     * 
     * @return student's test score
     */
    public List<Double> getScore() {
        return scores;
    }

    /**
     * Return total weight of score.
     * 
     * @return total weight of scores
     */
    public double getWeight() {
        return totalWeight;
    }

    /**
     * Return the course name.
     * 
     * @return course name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Return course code.
     * 
     * @return course code
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * Calculate the average score.
     * 
     * @return average score
     */
    public double getAverageScore() {
        double total = 0;
        for (int i = 0; i < scores.size(); i++) {
            total += scores.get(i);
        }

        return (total / totalWeight) * 100;

    }

    /**
     * Convert percentage score to GPA.
     * 
     * @return GPA
     */
    public double getGPA() {
        double score = getAverageScore();
        double GPA = 0;
        GPA = (score / 100) * 4;
        return GPA;
    }

    /**
     * Convert percentage score to letter grade.
     * 
     * @return letter grade
     */
    public String getLetterGrade() {
        String letter = "";
        double score = getAverageScore();

        if (score >= 95) {
            letter = "A+";

        } else if (score >= 87 && score < 95) {
            letter = "A";
        } else if (score >= 80 && score < 87) {
            letter = "A-";

        } else if (score >= 77 && score < 80) {
            letter = "B+";
        } else if (score >= 73 && score < 77) {
            letter = "B";
        } else if (score >= 70 && score < 73) {
            letter = "B-";
        } else if (score >= 67 && score < 70) {
            letter = "C+";
        } else if (score >= 63 && score < 67) {
            letter = "C";

        } else if (score >= 60 && score < 63) {
            letter = "C-";

        } else if (score >= 57 && score < 60) {
            letter = "D+";

        } else if (score >= 53 && score < 57) {
            letter = "D";
        } else if (score >= 50 && score < 53) {
            letter = "D-";
        } else if (score < 50) {
            letter = "I";
        } else if (score > 100) {
            letter = "Not a possible score";
        }
        return letter;
    }

    /**
     * Convert percentage score to level grade.
     * 
     * @return level grade
     */
    public String getLevelGrade() {
        int level = 0;
        double score = getAverageScore();

        if (score >= 80 && score <= 100) {
            level = 4;
        } else if (score >= 70 && score < 80) {
            level = 3;
        } else if (score >= 60 && score < 70) {
            level = 2;

        } else if (score >= 50 && score < 60) {
            level = 1;
        } else if (score < 50) {
            return "Level R";
        }
        return "Level " + level;
    }

    
}