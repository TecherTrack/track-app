package org.techer.track.service;

import org.techer.track.exception.UserNotFoundException;
import org.techer.track.model.User;

import java.util.List;

public interface TrackService {

    public List<User> getAllUsers();

    public User addUser(User user);

    public String deleteUser(int id) throws UserNotFoundException;

    public User updateUser(User user) throws UserNotFoundException;
}
