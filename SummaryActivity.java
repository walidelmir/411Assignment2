package com.example.application;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.example.application.adapter.SummaryAdapter;
import com.example.application.model.CourseEnrollement;
import com.example.application.model.Student;
import com.example.application.model.StudentDB;

import java.util.ArrayList;

public class SummaryActivity extends Activity {

    protected ListView SummaryView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createStudentObjects();

        setContentView(R.layout.summary_list);

        SummaryView = findViewById(R.id.summary_list_view_id);

        SummaryAdapter ad = new SummaryAdapter();

        SummaryView.setAdapter(ad);

    }


    protected void createStudentObjects() {

        // Create James Person object
        Student s = new Student("James ", "Shen");
        ArrayList<CourseEnrollement> courses = new ArrayList<CourseEnrollement>();
        courses.add(new CourseEnrollement("CPSC411", "A"));
        s.setCourses(courses);
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(s);


        // Create Another Student
        s = new Student("Walid ", "Elmir");
        courses = new ArrayList<CourseEnrollement>();
        courses.add(new CourseEnrollement("CPSC411", "A"));
        s.setCourses(courses);
        studentList.add(s);

        // Create Another Student
        s = new Student("Toni ", "Shapov");
        courses = new ArrayList<CourseEnrollement>();
        courses.add(new CourseEnrollement("CPSC411", "A"));
        s.setCourses(courses);
        studentList.add(s);

        StudentDB.getInstance().setStudents(studentList);
    }
}
