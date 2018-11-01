package edu.uno.cs.csci6363.groodleserver.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Course {

    @Id
    private Long course_id;
    private String course_name; 
    private int credit_hours;
    private String course_description;
    private String speciality;

    public Long getCourse_id() {
        return this.course_id;
    }

    public String getCourse_name() {
        return this.course_name;
    }

    public int getCredit_hours() {
        return this.credit_hours;
    }

    public String getCourse_description() {
        return this.course_description;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    @Override
    public String toString() {
        return "{" +
            " course_id='" + getCourse_id() + "'" +
            ", course_name='" + getCourse_name() + "'" +
            ", credit_hours='" + getCredit_hours() + "'" +
            ", course_description='" + getCourse_description() + "'" +
            ", speciality='" + getSpeciality() + "'" +
            "}";
    }

}