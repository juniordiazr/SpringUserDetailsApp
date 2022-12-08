package com.app.userdetails.controller;

import com.app.userdetails.exception.ResourceNotFoundException;
import com.app.userdetails.model.User;
import com.app.userdetails.repository.UserRepository;
import com.app.userdetails.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by juniordiazr on 05/12/22.
 */
@RestController
@RequestMapping("/api")
public class UserDetailsController {
	
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return userService.createUser(user);
    }
    
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable(value = "id") Long userId) {
        return userService.getUserById(userId);
    }
    
    @GetMapping("/users/email/{email}")
    public User getUserByEmail(@PathVariable(value = "email") String email) {
        return userService.getUserByEmail(email);
    } 

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable(value = "id") Long userId,
                                           @Valid @RequestBody User userDetails) {
        return userService.updateUser(userId, userDetails);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId) {
        return userService.deleteUser(userId);
    }
	

	
//    @Autowired
//    UserRepository userRepository;
//    
//    @GetMapping("/users")
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    public User createUser( User user) {
//        return userRepository.save(user);
//    }
//    
//    public User getUserById(Long userId) {
//        return userRepository.findById(userId)
//                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
//    }
//    
//    public User getUserByEmail(String email) {
//        return userRepository.findByEmail(email)
//                .orElseThrow(() -> new ResourceNotFoundException("User", "email", email));
//    } 
//
//    public User updateUser(Long userId,
//                                           @Valid @RequestBody User userDetails) {
//
//        User user = userRepository.findById(userId)
//                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
//
//        user.setName(userDetails.getName());
//        user.setUsername(userDetails.getUsername());
//        user.setEmail(userDetails.getEmail());
//        user.setPhone(userDetails.getPhone());
//
//        User updatedUser = userRepository.save(user);
//        return updatedUser;
//    }
//
//    public ResponseEntity<?> deleteUser(Long userId) {
//        User user = userRepository.findById(userId)
//                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
//
//        userRepository.delete(user);
//
//        return ResponseEntity.ok().build();
//    }
}

