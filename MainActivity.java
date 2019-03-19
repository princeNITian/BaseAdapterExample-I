package com.example.prince.hsamp5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {

    GridView simpleGrid;
    int animals[] = {R.drawable.learn, R.drawable.physics, R.drawable.chemistry, R.drawable.math, R.drawable.p4, R.drawable.picf, R.drawable.chemistry, R.drawable.learn, R.drawable.physics};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleGrid = (GridView) findViewById(R.id.simpleGridView);
        CustomAdapter customAdapter = new CustomAdapter(this/*getApplicationContext()*/, animals);
        simpleGrid.setAdapter(customAdapter);

    }
}