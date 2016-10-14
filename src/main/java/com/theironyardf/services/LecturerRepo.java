package com.theironyardf.services;

import com.theironyardf.entities.Lecturer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by joshuakeough on 10/13/16.
 */
public interface LecturerRepo extends CrudRepository<Lecturer, Integer> {
}
