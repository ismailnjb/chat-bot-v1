package com.zorpiko.ai.user_service.service;

import com.zorpiko.ai.user_service.model.User;
import com.zorpiko.ai.user_service.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User register(User user) {
        if (repo.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }
        return repo.save(user);
    }

    public User login(String email, String password) {
        Optional<User> existing = repo.findByEmail(email);
        if (existing.isEmpty() || !existing.get().getPassword().equals(password)) {
            throw new RuntimeException("Invalid credentials");
        }
        return existing.get();
    }
}
