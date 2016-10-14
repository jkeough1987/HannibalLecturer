package com.theironyardf.controllers;

import com.theironyardf.entities.Lecturer;
import com.theironyardf.entities.Review;
import com.theironyardf.services.LecturerRepo;
import com.theironyardf.services.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by joshuakeough on 10/13/16.
 */
@RestController
public class HannibalController {
    @Autowired
    LecturerRepo lectuerers;
    @Autowired
    ReviewRepo reviews;

    @RequestMapping(path = "/lecturers", method = RequestMethod.POST)
    public void addLecturer(String name, String topic, String image) {
        lectuerers.save(new Lecturer(name, topic, image));
    }

    @RequestMapping(path = "/reviews", method = RequestMethod.POST)
    public void addReview(String author, String text, int lecturerId, boolean isGood) {
        reviews.save(new Review(author, text, lecturerId, isGood));
    }

    @RequestMapping(path = "/lecturers", method = RequestMethod.GET)
    public List<Lecturer> getLecturer() {
        return (List<Lecturer> )lectuerers.findAll();
    }

    @RequestMapping(path = "/reviews", method = RequestMethod.GET)
    public List<Review> getReviews(Integer lecturerId) {
       return (List<Review>)reviews.findByLecturerId(lecturerId);

    }

}