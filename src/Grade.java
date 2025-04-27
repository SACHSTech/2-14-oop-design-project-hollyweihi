public class Grade {
    private double score;
    private String courseName;
    private int courseId;

    public Grade(double score, String courseName, int courseId){
        this.score = score;
        this.courseName = courseName;
        this.courseId = courseId;
    }

    public double getScore(){
        return score;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getCourseId(){
        return courseId;
    }

    public double getGPA(){
        double GPA = 0;
        GPA = (score/100) * 4;
        return GPA;
    }
}