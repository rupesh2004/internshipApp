package com.example.democourse;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class adapter1{
    private String courseName,duration,amount;
    private int imgId;
    public adapter1(String courseName,String duration,String amount, int imgId) {
        this.courseName = courseName;
        this.duration = duration;
        this.amount = amount;
        this.imgId = imgId;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getDuration() {
        return duration;
    }
    public String getAmount() {
        return amount;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}

