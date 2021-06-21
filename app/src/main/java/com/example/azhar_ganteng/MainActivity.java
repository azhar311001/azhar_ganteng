package com.example.azhar_ganteng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depan);
    }

    public void biografi(View view) {
        Intent inew = new Intent(this,bio.class);
        startActivity(inew);
    }

    public void sejarah(View view) {
        Intent inew = new Intent(this,sjh.class);
        startActivity(inew);
    }
}