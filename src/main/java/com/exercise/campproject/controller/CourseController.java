package com.exercise.campproject.controller;

import com.exercise.campproject.model.Course;
import com.exercise.campproject.model.Review;
import com.exercise.campproject.service.CourseService;
import com.exercise.campproject.service.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController @RequiredArgsConstructor @RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Course> getAllBootCamps(@RequestParam Optional<String> courseName) {
        return courseService.findAll(courseName);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Course getBootcampById(@PathVariable Long id) {
        return courseService.findById(id);
    }

    @PostMapping("/{id}/reviews")
    @ResponseStatus(HttpStatus.OK)
    public Course addReview(@PathVariable Long id, @RequestBody Review review){
        return courseService.addReview(id, review);
    }

    @PostMapping("{id}/courses")
    @ResponseStatus(HttpStatus.OK)
    public Review addCourse(@PathVariable Long id, @RequestBody Course course){
        return courseService.addCourse(id,course);
    }

    @DeleteMapping("/delete/{id}")
    public Map<String, Boolean> removeSingleCourse(@PathVariable Long id)throws Exception{
        return courseService.deleteCourse(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Course> updateUser(
            @PathVariable(value = "id") Long id,@RequestBody Course courseDetails) throws ResourceNotFoundException {
        return courseService.updateCourse(id,courseDetails);
    }
}
