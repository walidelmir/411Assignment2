package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.application.model.CourseEnrollement;
import com.example.application.model.Student;
import com.example.application.model.StudentDB;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createStudentObjects();
        setContentView(R.layout.student_summary);

        root = findViewById(R.id.student_summary);

        ArrayList<Student> studentList = StudentDB.getInstance().getStudents();

        for(int i =0 ; i< studentList.size(); i++){

            Student s = studentList.get(i);

            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.student_row, root, false);

            TextView firstNameView = (TextView) row_view.findViewById(R.id.first_name);
            firstNameView.setText(s.getFirstName());

            TextView lastNameView = (TextView) row_view.findViewById(R.id.last_name);
            lastNameView.setText(s.getLastName());

            root.addView(row_view);

        }
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
