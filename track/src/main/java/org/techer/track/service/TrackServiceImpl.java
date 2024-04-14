package org.techer.track.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techer.track.dao.TrackDao;
import org.techer.track.exception.UserNotFoundException;
import org.techer.track.model.User;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService{
    @Autowired
    private TrackDao trackDao;
    @Override
    public List<User> getAllUsers() {
        return trackDao.findAll();
    }

    @Override
    public User addUser(User user) {
        return trackDao.save(user);
    }

    @Override
    public String deleteUser(int id) throws UserNotFoundException {
        Boolean isExist = trackDao.existsById(id);
        if(!isExist){
            throw new UserNotFoundException("Invalid User Id : " + id);
        }
        trackDao.deleteById(id);
        return "User Deleted Successfully";
    }

    @Override
    public User updateUser(User user) throws UserNotFoundException {
        User updateUser =  trackDao.findById(user.getId()).orElse(null);
        if(updateUser == null){
            throw new UserNotFoundException("Please update existing user. Invalid user details are provided : " + user.getName());
        }
        updateUser.setName(user.getName());
        updateUser.setCourse(user.getCourse());
        updateUser.setEmail(user.getEmail());
        updateUser.setPhoneNumber(user.getPhoneNumber());
        return trackDao.save(updateUser);
    }
}
