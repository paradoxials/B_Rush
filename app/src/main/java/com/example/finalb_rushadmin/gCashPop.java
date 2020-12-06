package com.example.finalb_rushadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gCashPop extends AppCompatActivity {
    private Button showSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_cash_pop);
        showSearch = (Button) findViewById(R.id.testSearch);

        showSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){ openBusSearch();}
        });
    }

    public void openBusSearch(){
        Intent intent = new Intent(this, BusSearch.class);
        startActivity(intent);
    }
}