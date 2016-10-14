package com.theironyardf.services;

import com.theironyardf.entities.Lecturer;
import com.theironyardf.entities.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by joshuakeough on 10/13/16.
 */
public interface ReviewRepo extends CrudRepository<Review, Integer> {
    List<Review> findByLecturerId(Integer lecturerId);
}
