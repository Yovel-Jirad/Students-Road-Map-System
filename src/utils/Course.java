package utils;

public class Course {
    private String courseId;
    private float coursePoints;
    private int grade;
    private CourseType type;

    public Course(String courseId, float coursePoints, CourseType type){
        this.courseId=courseId;
        this.coursePoints=coursePoints;
        this.type=type;
    }

    private CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public float getCoursePoints() {
        return coursePoints;
    }

    public void setCoursePoints(float coursePoints) {
        this.coursePoints = coursePoints;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
