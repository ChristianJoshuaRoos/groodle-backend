package edu.uno.cs.csci6363.groodleserver.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
public class CourseController {
  @GetMapping("/getCourses")
  public String  getCourses() {
    return "['CSCI', 'CSCI2']";
  }
}