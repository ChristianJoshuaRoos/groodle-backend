package edu.uno.cs.csci6363.groodleserver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uno.cs.csci6363.groodleserver.entities.Course;
import edu.uno.cs.csci6363.groodleserver.repositories.CourseRepository;

import java.util.List;

@Service
public class CourseService{

    @Autowired
    private CourseRepository courseRepository;
    
    public List<Course> getCourseList(){
        return courseRepository.findAll();
    }
}
