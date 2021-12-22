package com.example.reloj;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showDatePicker(View view) {
        DialogFragment newFragment = new Time();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        String hora = String.valueOf(hourOfDay);
        String minu = String.valueOf(minute);
        Toast.makeText(this, "Hora " + hora + " minutos " + minu,Toast.LENGTH_SHORT).show();
    }
}