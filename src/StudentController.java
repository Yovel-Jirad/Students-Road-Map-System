import utils.Course;
import utils.Student;

import java.util.List;

public class StudentController {

    private final Student student;

    public StudentController(Student student){
        this.student=student ;
    }
    /*
        will calculate average based on the course list that was given to it
        will return 0.0f if failed
     */
    public float calcAverage(List<Course> cursesList){
        float retAverageValue = 0.0f ;
        float totalCoursesPoints = 0.0f ;
        if (cursesList==null || cursesList.isEmpty()){
            System.out.println("cant calc average");
        }
        else{
            for(Course currCourse : cursesList){
                retAverageValue += (currCourse.getCoursePoints() * currCourse.getGrade()) ;
                totalCoursesPoints += currCourse.getCoursePoints();
            }
            retAverageValue/= totalCoursesPoints;
        }
        return retAverageValue;
    }
}
