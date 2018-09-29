package edu.uno.cs.csci6363.groodleserver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.uno.cs.csci6363.groodleserver.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findAll();
    
}
