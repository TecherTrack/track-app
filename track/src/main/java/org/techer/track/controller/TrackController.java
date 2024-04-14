package org.techer.track.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.techer.track.exception.UserNotFoundException;
import org.techer.track.model.User;
import org.techer.track.service.TrackService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class TrackController {

    @Autowired
    private TrackService trackService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUser(){
        return trackService.getAllUsers();
    }


    @PostMapping("/adduser")
    public User createUser(@RequestBody User user){
        return trackService.addUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) throws UserNotFoundException {
        return trackService.deleteUser(id);
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user ) throws UserNotFoundException {
        return trackService.updateUser(user);
    }
}
