package com.example.democourse;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sign_up extends AppCompatActivity {

    TextView termsAndConditions,login;
    SpannableString spannableString , spannableString2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        termsAndConditions = findViewById(R.id.ternsmandconditions);
         String needHelpString = termsAndConditions.getText().toString().trim();
         spannableString = new SpannableString(needHelpString);
         int startIndex = needHelpString.indexOf("Terms and Conditions");
         int endIndex = startIndex + "Terms and Conditions".length();
         spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#00A5EC")), startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        termsAndConditions.setText(spannableString);



        login = findViewById(R.id.alreadyResgistered);
        String loginString = login.getText().toString().trim();
        spannableString2 = new SpannableString(loginString);
        int startIndex1 = loginString.indexOf("Login");
        int endIndex1 = startIndex1 + "Login".length();
        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor("#00A5EC")), startIndex1, endIndex1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        login.setText(spannableString2);
    }

    public void termsAndConditions(View view) {
    }

    public void create_acc_fun(View view) {
        Intent i = new Intent(this, loginPage.class);
        startActivity(i);
        finish();
    }

    public void alreadyRegstered(View view) {
        Intent i = new Intent(this,loginPage.class);
        startActivity(i);
        finish();
    }
}