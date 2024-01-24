package com.example.democourse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class courseContentPage extends AppCompatActivity {

    TextView content;
    String text = "Learn how to create applications for Android including how to build and manage the lifecycle of a mobile app using Android Studio.";

    ListView lst;
    String contents[] = {"Introduction to Android application", "Version control", "Fundamentals in Kotlin", "Working with Data in Android", "Mobile Development and JavaScript", "Android App Capstone"};
    TextView title,courseDuration,fees;
    ImageView companyLogo;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_content_page);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        int imageId = i.getIntExtra("image",0);
        String duration = i.getStringExtra("duration");
        String courseFees = i.getStringExtra("fees");
        content = findViewById(R.id.description);
        content.setText(text);

        title=findViewById(R.id.title);
        title.setText(name);

        companyLogo = findViewById(R.id.companyLogo);
        companyLogo.setImageResource(imageId);

        courseDuration =(TextView) findViewById(R.id.courseDuration);
        courseDuration.setText(duration);

        fees = findViewById(R.id.fees);
        fees.setText(courseFees);

        lst = findViewById(R.id.lst);

        // CustomAdapter is used instead of ArrayAdapter
        CustomAdapter adapter = new CustomAdapter(this, contents);

        lst.setAdapter(adapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), contents[position], Toast.LENGTH_LONG).show();
            }

        });
    }
}