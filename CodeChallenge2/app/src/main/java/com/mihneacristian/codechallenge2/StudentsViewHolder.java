package com.mihneacristian.codechallenge2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentsViewHolder extends RecyclerView.ViewHolder {

    private TextView textViewFirstName;

    private TextView textViewLastName;

    public StudentsViewHolder(@NonNull View studentView) {
        super(studentView);

        this.textViewFirstName = studentView.findViewById(R.id.textViewFirstName);
        this.textViewLastName = studentView.findViewById(R.id.textViewLastName);
    }

    public TextView getTextViewFirstName() {
        return textViewFirstName;
    }

    public TextView getTextViewLastName() {
        return textViewLastName;
    }
}
