package com.example.application.model;

import java.util.ArrayList;

public class Student {

    protected String FirstName;
    protected String LastName;
    protected ArrayList<CourseEnrollement> Courses;

    public Student(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public ArrayList<CourseEnrollement> getCourses() {
        return Courses;
    }

    public void setCourses(ArrayList<CourseEnrollement> courses) {
        Courses = courses;
    }
}
