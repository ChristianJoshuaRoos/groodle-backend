package edu.uno.cs.csci6363.groodleserver.views;

import edu.uno.cs.csci6363.groodleserver.entities.Course;

public class ConcentrationRecommendation{
    private String concentration;
    private Course[] recommendedCourses;

    public String getConcentration() {
        return this.concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public Course[] getRecommendedCourses() {
        return this.recommendedCourses;
    }

    public void setRecommendedCourses(Course[] recommendedCourses) {
        this.recommendedCourses = recommendedCourses;
    }

    
}