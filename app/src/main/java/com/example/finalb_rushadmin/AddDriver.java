package com.example.finalb_rushadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddDriver extends AppCompatActivity {
    private DatabaseHelper databaseHelper;
    private Button btnAddDriver;
    private EditText fname, mname, lname, add, bday, num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_driver);
        databaseHelper = new DatabaseHelper(this);
        //get the values
        fname = (EditText) findViewById(R.id.getDriverFName);
        mname = (EditText) findViewById(R.id.getDriverMName);
        lname = (EditText) findViewById(R.id.getDriverLName);
        add = (EditText) findViewById(R.id.getDriverAddress);
        bday = (EditText) findViewById(R.id.getDriverBday);
        num = (EditText) findViewById(R.id.getDriverContactNum);

        //button to insert a new driver
        btnAddDriver = (Button) findViewById(R.id.btnAddDriver);
        InsertDriverData();
    }

    public void InsertDriverData()
    {
        btnAddDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = databaseHelper.insertPerson(fname.getText().toString(), mname.getText().toString(),
                        lname.getText().toString(), add.getText().toString(), bday.getText().toString(),
                        num.getText().toString());
                if(isInserted)
                { Toast.makeText(AddDriver.this, "Data inserted", Toast.LENGTH_SHORT).show(); }
                else {Toast.makeText(AddDriver.this, "Failed to insert data", Toast.LENGTH_SHORT).show();}
            }
        });
    }
}