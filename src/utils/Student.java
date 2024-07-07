package utils;

import java.util.Date;

public class Student {
    private String id, email; ;
    private String firstName, lastName;
    private Date startDate, endDate;
    private char currentSemester;
    private DegreeFaculty faculty;

    public Student(String id, String email, String firstName, String lastName){
        this.id=id;
        this.email=email;
        this.firstName=firstName;
        this.lastName=lastName;
    }


    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public char getCurrentSemester() {
        return currentSemester;
    }

    public DegreeFaculty getFaculty() {
        return faculty;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setCurrentSemester(char currentSemester) {
        this.currentSemester = currentSemester;
    }

    public void setFaculty(DegreeFaculty faculty) {
        this.faculty = faculty;
    }

}
