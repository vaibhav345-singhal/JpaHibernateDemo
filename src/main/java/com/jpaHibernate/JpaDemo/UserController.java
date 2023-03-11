package com.jpaHibernate.JpaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getAll")
    public List<User> getALl() {
        return userService.getAll();
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @DeleteMapping("delete/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }
}
