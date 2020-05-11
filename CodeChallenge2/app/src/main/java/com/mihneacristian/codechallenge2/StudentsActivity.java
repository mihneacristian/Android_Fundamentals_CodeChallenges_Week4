package com.mihneacristian.codechallenge2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class StudentsActivity extends AppCompatActivity {

    private List<Student> students;

    private RecyclerView recyclerViewStudentsActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.students_activity);

        getStudents();
        recyclerViewStudentsActivity = this.findViewById(R.id.recyclerViewStudentsActivity);
        setLayoutManager(recyclerViewStudentsActivity);
        setAdapter(recyclerViewStudentsActivity);
    }

    public void getStudents() {

        students = new ArrayList<>();
        Student student = null;

        for (int i = 1; i < 50; i++) {

            student = new Student();
            student.setFirstName("FirstName " + i);
            student.setLastName("LastName " + i);

            students.add(student);
        }
    }

    private void setLayoutManager(RecyclerView recyclerView) {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewStudentsActivity.setLayoutManager(linearLayoutManager);
    }

    public void setAdapter(RecyclerView recyclerView) {

        StudentsAdapter studentsAdapter = new StudentsAdapter(students);
        recyclerView.setAdapter(studentsAdapter);
    }
}
