package com.example.democourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class forgotPassword extends AppCompatActivity {

    TextView needHelp;
    SpannableString spannableString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        needHelp = findViewById(R.id.needHelp);
        String needHelpString = needHelp.getText().toString().trim();
        spannableString = new SpannableString(needHelpString);
        int startIndex = needHelpString.indexOf("Need help?");
        int endIndex = startIndex + "Need help?".length();
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#00A5EC")), startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        needHelp.setText(spannableString);

    }
    public void Send_Email_func(View view) {
        Intent i = new Intent(this,loginPage.class);
        startActivity(i);
        finish();
    }

    public void needHelpFunction(View view) {
        Toast.makeText(this, "Function is under development", Toast.LENGTH_SHORT).show();
    }
}