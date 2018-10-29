package edu.uno.cs.csci6363.groodleserver.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Course {

    @Id
    private Long courseId;
    private String courseTitle; 
    private int creditHours;
    private String courseDescription;
    private String concentration; 

    public Long getCourseId() {
        return this.courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCreditHours() {
        return this.creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getCourseDescription() {
        return this.courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getConcentration() {
        return this.concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    @Override
    public String toString() {
        return "{" +
            " courseId='" + getCourseId() + "'" +
            ", courseTitle='" + getCourseTitle() + "'" +
            ", creditHours='" + getCreditHours() + "'" +
            ", courseDescription='" + getCourseDescription() + "'" +
            ", concentration='" + getConcentration() + "'" +
            "}";
    }

    
}