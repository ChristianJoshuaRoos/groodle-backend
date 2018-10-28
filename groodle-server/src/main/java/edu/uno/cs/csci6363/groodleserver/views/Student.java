package edu.uno.cs.csci6363.groodleserver.views;

import edu.uno.cs.csci6363.groodleserver.entities.Course;

public class Student{
    private String firstName;
    private String lastName;
    private String concentration;
    private Course[] coursesTaken;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getConcentration() {
        return this.concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public Course[] getCoursesTaken() {
        return this.coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
}
