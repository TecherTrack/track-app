package org.techer.track.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.techer.track.model.User;

import java.util.List;

public interface TrackDao extends JpaRepository<User , Integer> {

}
