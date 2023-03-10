package com.jpaHibernate.JpaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public String addUser(User user) {
        userRepo.save(user);
        return "User Added";
    }

    public User getUser(int id) {
        return userRepo.findById(id).get();
    }

    public List<User> getAll() {
        return userRepo.findAll();
    }
}
