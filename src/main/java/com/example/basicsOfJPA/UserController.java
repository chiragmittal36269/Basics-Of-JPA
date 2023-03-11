package com.example.basicsOfJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/get_user")
    public List<User> getUser() {
        return userService.getUser();
    }

    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id) {
        return userService.getUser(id);
    }

    // delete by id
    // delete all the user
    // update a user by id

    @DeleteMapping("/delete")
    public String deleteUser(@RequestParam("id") int id)
    {
        return deleteUser(id);
    }

    public String deleteUser()
    {
        return userService.deleteUser();
    }
}
