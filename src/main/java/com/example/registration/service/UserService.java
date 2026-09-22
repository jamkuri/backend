package com.example.registration.service;

import com.example.registration.model.User;
import com.example.registration.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User save(User user) {
        user.setId(null);
        return repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }
}
