package com.mihneacristian.codechallenge2;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsViewHolder> {

    private List<Student> students;

    public StudentsAdapter(List<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View studentItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
        return new StudentsViewHolder(studentItem);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder holder, int position) {

        Student currentStudent = students.get(position);
        holder.getTextViewFirstName().setText(currentStudent.getFirstName());
        holder.getTextViewLastName().setText(currentStudent.getLastName());

        if (position %2 == 0) {
            holder.itemView.setBackgroundColor(Color.WHITE);
        } else {
            holder.itemView.setBackgroundColor(Color.parseColor("#F5F5F5"));
        }
    }

    @Override
    public int getItemCount() {

        return students.size();
    }
}
