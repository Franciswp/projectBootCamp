package com.exercise.campproject.service;

import com.exercise.campproject.model.User;
import com.exercise.campproject.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public User addNewUser(User user){
        return userRepository.save(user);
    }
}
