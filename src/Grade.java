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

    public String getLetterGrade(){
        String letter = "";

        if(score >= 95){
            letter = "A+";

        } else if(score >= 87 && score < 95){
            letter = "A";
        }else if(score >= 80 && score < 87){
            letter = "A-";

        }else if (score >= 77 && score < 80){
            letter = "B+";
        }else if(score >= 73 && score < 77){
            letter = "B";
        }else if (score >= 70 && score<73){
            letter = "B-";
        }else if(score >=67 && score <70){
            letter = "C+";
        }else if (score >=63 && score< 67){
            letter = "C";

        }else if(score >= 60&& score <63){
            letter = "C-";

        }else if (score >=57 && score < 60){
            letter = "D+";

        }else if(score >= 53 && score < 57){
            letter = "D";
        }else if (score >= 50 && score <53){
            letter = "D-";
        }else if (score <50){
            letter = "I";
        }else if (score >100){
            letter = "Not a possible score";
        }
       return letter;
    }
}