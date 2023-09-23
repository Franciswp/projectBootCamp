package com.exercise.campproject.repository;

import com.exercise.campproject.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {
    List<Course> findAllByCourseName(String courseName);
}
