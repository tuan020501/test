package com.example.a11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hinh_13);
        getSupportActionBar().hide();
        Button buton11= (Button) findViewById(R.id.h11);
        Button buton12= (Button) findViewById(R.id.but12);
        Button butol13= (Button) findViewById(R.id.butQl13);
        buton11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.hinh_14);
            }
        });


    }
}