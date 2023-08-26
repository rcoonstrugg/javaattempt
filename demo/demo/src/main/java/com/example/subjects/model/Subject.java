package com.example.subjects.model;

public class Subject {
    private Long id; // Include an ID field if necessary
    private String name;
    private int ects;
    private String roomNumber;
    private boolean hasExam;

    // Constructors
    public Subject() {
    }

    public Subject(String name, int ects, String roomNumber, boolean hasExam) {
        this.name = name;
        this.ects = ects;
        this.roomNumber = roomNumber;
        this.hasExam = hasExam;
    }

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
}
