package edu.uno.cs.csci6363.groodleserver.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import edu.uno.cs.csci6363.groodleserver.entities.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

    List<Course> findAll();
    
}
