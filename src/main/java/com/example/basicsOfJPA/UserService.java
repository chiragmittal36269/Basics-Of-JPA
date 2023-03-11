package com.example.basicsOfJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
//    how to make the object of interface?
//    it is not possible to make the object of interface until the implementation of that interface is not done by any class
//    in this case implementation of userRepository interface is done by hibernate class, so we can create the object of interface
    public String addUser(User user) {
        userRepository.save(user);  // it helps to save the data of User class in the table name User
        return "User Added";
    }

    public List<User> getUser() {

        return userRepository.findAll();    // it helps to fin the details of all users
    }

    public User getUser(int id) {

        return userRepository.findById(id).get();   // it helps to find the details of particular user
    }

    public String deleteUser(int id)
    {
        userRepository.deleteById(id);
        return "User deleted";
    }

    public String deleteUser()
    {
        userRepository.deleteAll();
        return "All User Deleted Successfully";
    }

    public String userUpdate(int id)
    {
        return "User Updated";
    }
}