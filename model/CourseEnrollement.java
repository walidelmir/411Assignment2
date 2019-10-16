package com.example.application.model;

public class CourseEnrollement {

    protected String CourseID;
    protected  String Grade;

    public CourseEnrollement(String courseID, String grade) {
        CourseID = courseID;
        Grade = grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public String getGrade() {
        return Grade;
    }

    public String getCourseID() {
        return CourseID;
    }


}
