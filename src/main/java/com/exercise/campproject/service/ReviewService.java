package com.exercise.campproject.service;

import com.exercise.campproject.model.Review;
import com.exercise.campproject.repository.ReviewRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    @Transactional
    public Review addNewReview(Review review){
        return reviewRepository.save(review);
    }
}
