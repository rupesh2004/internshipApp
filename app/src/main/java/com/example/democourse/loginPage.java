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

public class loginPage extends AppCompatActivity {

    TextView needHelp;
    SpannableString spannableString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        needHelp = findViewById(R.id.signup);
        String needHelpString = needHelp.getText().toString().trim();
        spannableString = new SpannableString(needHelpString);
        int startIndex = needHelpString.indexOf("Sign up");
        int endIndex = startIndex + "Sign up".length();
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#00A5EC")), startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        needHelp.setText(spannableString);
    }

    public void forgotpassword(View view) {
        Intent i =new Intent(this, forgotPassword.class);
        startActivity(i);
        finish();
    }

    public void Login_func(View view) {
        Intent  i =new Intent(this,chooseDurationAndPayment.class);
        startActivity(i);
        finish();
    }

    public void Signup(View view) {
        Intent  i =new Intent(this,sign_up.class);
        startActivity(i);
        finish();
    }
}