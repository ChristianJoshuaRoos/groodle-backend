package edu.uno.cs.csci6363.groodleserver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import edu.uno.cs.csci6363.groodleserver.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query("SELECT c FROM Course c")
    List<Course> getCourseList();

    List<Course> findByCourseTitleNotInAndConcentration(List<String> courseTitles, String concentration);
    
    List<Course> findByConcentration(String concentration);

}
