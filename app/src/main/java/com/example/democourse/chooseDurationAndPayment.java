package com.example.democourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class chooseDurationAndPayment extends AppCompatActivity {

    String[] durationArray = {"All","4 Days", "10 Days", "15 Days", "1 Month", "3 Month", "6 Month", "1 Year"};
    String[] paymentModeArray = {"Paid","Unpaid","Stipend"};
    String selectedDuration="",selectedPayment="";
    Spinner duration, payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_duration_and_payment);

        duration = findViewById(R.id.duration);
        payment = findViewById(R.id.paymentmode);

        ArrayAdapter<String> durationAdapter =new ArrayAdapter<>(
                this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,durationArray
        );

        duration.setAdapter(durationAdapter);

        duration.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selectedDuration = durationArray[i];

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> paymentModeAdapter = new ArrayAdapter<>(
                this,
                androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,
                paymentModeArray
        );
        payment.setAdapter(paymentModeAdapter);

        payment.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selectedPayment = paymentModeArray[i];

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void ViewResults(View view) {
        Intent i = new Intent(this, chooseCourse.class);
        startActivity(i);
        finish();
    }
}