package com.zorpiko.ai.user_service.service;

import com.zorpiko.ai.user_service.model.User;
import com.zorpiko.ai.user_service.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User createUser(User user) {
        return repo.save(user);
    }
}
