package edu.uno.cs.csci6363.groodleserver.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import edu.uno.cs.csci6363.groodleserver.services.CourseService;
import edu.uno.cs.csci6363.groodleserver.views.Recommendation;
import edu.uno.cs.csci6363.groodleserver.views.Student;


@RestController
@RequestMapping("/api/planning")
public class PlanningController {

  @Autowired
  public CourseService courseService;

/*Please add the @CrossOrigin annotation to your code in the 
back-end.  From what I understand, it allows the front-end server 
to access the back-end server, through a Web browser.  The front-end
server is on port 3000.*/
  @CrossOrigin(origins = "http://localhost:3000")
  @PostMapping("/getRecommendation")
  public Recommendation  getRecommendation(@RequestBody Student student) {
    return this.courseService.getRecommendedCourses(student);
  }
}