package com.exercise.campproject.repository;

import com.exercise.campproject.model.BootCamp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BootcampRepository extends JpaRepository<BootCamp,Long> {
    List<BootCamp> findAllByLocation(String location);
}
