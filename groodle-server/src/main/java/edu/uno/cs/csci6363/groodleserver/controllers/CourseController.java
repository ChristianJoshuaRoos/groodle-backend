package edu.uno.cs.csci6363.groodleserver.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import edu.uno.cs.csci6363.groodleserver.entities.Course;
import edu.uno.cs.csci6363.groodleserver.services.CourseService;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

  @Autowired
  public CourseService courseService;

/*Please add the @CrossOrigin annotation to your code in the 
back-end.  From what I understand, it allows the front-end server 
to access the back-end server, through a Web browser.  The front-end
server is on port 3000.*/
  @CrossOrigin(origins = "http://localhost:3000")
  @GetMapping("/getCourseList")
  public List<Course>  getCourseList() {
    return courseService.getCourseList();
  }
}