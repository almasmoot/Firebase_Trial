package com.example.firebasetrial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class NewGoals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_goals);
        Button selectDate = findViewById(R.id.btnDate);
        selectDate.setOnClickListener(new View.OnClickListener() {
        @Override

            public void onClick(View view)
            {
                DatePickerDialog datePickerDialog = new DatePickerDialog(NewGoals.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                            }
                        }, 0, 0, 0);
                datePickerDialog.show();
            }
        });
    }

    public void selectDate(View view)
    {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                    }
                }, 0, 0, 0);
        datePickerDialog.show();
    }
}