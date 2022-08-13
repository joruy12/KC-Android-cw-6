package com.example.myapplicationcw6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Student> studentArrayList = new ArrayList<>();
  int currentStudent =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Age = findViewById(R.id.studentAge);
        TextView studentName = findViewById(R.id.changeStudent);
        TextView Name = findViewById(R.id.studentName);
        ImageView img = findViewById(R.id.imageView);
        TextView Grade = findViewById(R.id.Grade);
        Button next = findViewById(R.id.next);
        Intent intent = new Intent();
        String name = "jory";
        Student student1 = new Student("joruy",16,11,R.drawable.androidimg);
        Student student2 = new Student("sara",17,12,R.drawable.androidimg);
        Student student3 = new Student("shosho",18,12,R.drawable.androidimg);

        studentArrayList.add(student1); //0
        studentArrayList.add(student2); //1
        studentArrayList.add(student3); //2

        img.setImageResource(studentArrayList.get(currentStudent).getStudentPhoto());
        Name.setText(studentArrayList.get(currentStudent).getStudentName());
        Age.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
      Grade.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));
next.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        currentStudent++;
        if (currentStudent == studentArrayList.size()){
            currentStudent =0;

        }
        img.setImageResource(studentArrayList.get(currentStudent).getStudentPhoto());
        Name.setText(studentArrayList.get(currentStudent).getStudentName());
        Age.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
        Grade.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));



    }

});
    }
}