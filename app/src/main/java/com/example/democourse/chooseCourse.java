package com.example.democourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

public class chooseCourse extends AppCompatActivity implements OnItemClickListener {

    adapter1[] myListData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_course);
         myListData = new adapter1[] {
                new adapter1("Android Development","3 months","2000", R.drawable.googlelogo),
                new adapter1("Web Development","5 months","3000", R.drawable.googlelogo),
                new adapter1("Full Stack","3 months","2000", R.drawable.googlelogo),
                new adapter1("Nothing Development","3 months","2000", R.drawable.googlelogo),
                new adapter1("Nothing Development","3 months","2000", R.drawable.googlelogo),
                new adapter1("Android Development","3 months","2000", R.drawable.googlelogo)
        };


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter adapter = new adapter(myListData,this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
    public void onItemClick(int position) {
        Intent intent = new Intent(this, courseContentPage.class);
        intent.putExtra("name",myListData[position].getCourseName());
        intent.putExtra("image",myListData[position].getImgId());
        intent.putExtra("duration",myListData[position].getDuration());
        intent.putExtra("fees",myListData[position].getAmount());
        startActivity(intent);
    }
}

