package com.theironyardf.entities;

import javax.persistence.*;

/**
 * Created by joshuakeough on 10/13/16.
 */
@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private int lecturerId;

    @Column(nullable = false)
    private boolean isGood;


    public Review() {
    }

    public Review(String author, String text, int lecturerId, boolean isGood) {
        this.author = author;
        this.text = text;
        this.lecturerId = lecturerId;
        this.isGood = isGood;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(int lecturerId) {
        this.lecturerId = lecturerId;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

}

