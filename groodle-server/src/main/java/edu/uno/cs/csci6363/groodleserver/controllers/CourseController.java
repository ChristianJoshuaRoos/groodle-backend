package edu.uno.cs.csci6363.groodleserver.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uno.cs.csci6363.groodleserver.entities.Course;
import edu.uno.cs.csci6363.groodleserver.services.CourseService;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

  @Autowired
  public CourseService courseService;

  @GetMapping("/getCourseList")
  public List<Course>  getCourseList() {
    return courseService.getCourseList();
  }
}