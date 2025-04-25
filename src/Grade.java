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

        if(score >= 85 && score < 100){
            GPA = 4.0;
            return GPA;
        }else if (score >= 80 && score < 85){
            GPA = 3.7;
            return GPA;
        }else if(score >= 75 && score < 80){
            GPA = 3.3;
            return GPA;
        }else if (score >= 70 && score < 75){
            GPA = 3.0;
            return GPA;
        }
    }
}