package com.example.finalb_rushadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddRoute extends AppCompatActivity {
    private Spinner spinnerTime, spinnerDriver, spinnerBusNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_route);

        spinnerTime = findViewById(R.id.getTime);
        String[] timeSched = getResources().getStringArray(R.array.time_schedule);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, timeSched);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTime.setAdapter(adapter);

        spinnerDriver = findViewById(R.id.getBusDriver);
        String[] driverList = getResources().getStringArray(R.array.bus_driver);
        ArrayAdapter adapterD = new ArrayAdapter(this, android.R.layout.simple_spinner_item, driverList);
        adapterD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDriver.setAdapter(adapterD);

        spinnerBusNum = findViewById(R.id.getBusNumber);
        String[] busNum = getResources().getStringArray(R.array.bus_number);
        ArrayAdapter adapterB = new ArrayAdapter(this, android.R.layout.simple_spinner_item, busNum);
        adapterB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBusNum.setAdapter(adapterB);
    }
}