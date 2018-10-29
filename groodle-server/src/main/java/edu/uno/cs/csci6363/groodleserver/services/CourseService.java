package edu.uno.cs.csci6363.groodleserver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uno.cs.csci6363.groodleserver.entities.Course;
import edu.uno.cs.csci6363.groodleserver.repositories.CourseRepository;
import edu.uno.cs.csci6363.groodleserver.views.ConcentrationRecommendation;
import edu.uno.cs.csci6363.groodleserver.views.Recommendation;
import edu.uno.cs.csci6363.groodleserver.views.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CourseService{

    @Autowired
    private CourseRepository courseRepository;
    
    public List<Course> getCourseList(){
        return courseRepository.getCourseList();
    }

    public Recommendation getRecommendedCourses(Student student){

        Course[] coursesTaken = student.getCoursesTaken();
        String[] concentrations = {
            "Theoretical Computer Science and Programming Languages", 
            "Systems and Networks", 
           "Information Assurance",
           "Software Systems",
           "Database Systems and Distributed Applications",
           "Computer Graphics and Visual Computing",
           "Artificial Intelligence",
           "Bioinformatics"
        };
        List<Course> depthCoursesTaken = Stream.of(coursesTaken).filter(c -> c.getConcentration().equals(student.getConcentration())).collect(Collectors.toList());
        List<Course> coursesNeeded;
        ArrayList<ConcentrationRecommendation> breadthRecommendations = new ArrayList<>();

        ConcentrationRecommendation cr = new ConcentrationRecommendation();

        Recommendation recommendation = new Recommendation();
        
        // depth requirements calc
        if(depthCoursesTaken.size() >= 3){
            coursesNeeded = null;
        }else if(depthCoursesTaken.size() == 0){
            coursesNeeded = this.courseRepository.findByConcentration(student.getConcentration());
        }else{
            coursesNeeded = this.courseRepository.findByCourseTitleNotInAndConcentration(depthCoursesTaken, student.getConcentration());
        }

        cr.setConcentration(student.getConcentration());
        cr.setRecommendedCourses(coursesNeeded.toArray(new Course[0]));
        recommendation.setDepthRecommendation(cr);

        // breadth requirment calc
        for(String concentration : concentrations){
            List<Course> taken =  Stream.of(coursesTaken).filter(c -> c.getConcentration().equals(concentration)).collect(Collectors.toList());
            List<Course> canTake;
            if(taken.size() >= 1){
                canTake = null;
            }else{
                canTake = this.courseRepository.findByConcentration(concentration);
            }

            cr.setConcentration(concentration);
            cr.setRecommendedCourses(canTake.toArray(new Course[0]));
            breadthRecommendations.add(cr);
        }

        recommendation.setBreadthRecommendations(breadthRecommendations.toArray(new ConcentrationRecommendation[0]));

        return recommendation;
    }
}
