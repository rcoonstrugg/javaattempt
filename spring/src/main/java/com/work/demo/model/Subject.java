package com.work.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int ects;
    private String name;
    private String roomNumber;
    private boolean hasExam;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isHasExam() {
        return hasExam;
    }

    public void setHasExam(boolean hasExam) {
        this.hasExam = hasExam;
    }


    @Override
    public String toString() {
        return "Subject [id=" + id + ", name=" + name + ", ects=" + ects +
                ", roomNumber=" + roomNumber + ", hasExam=" + hasExam + "]";
    }
}
