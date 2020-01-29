package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.fragment1);
        button2 = findViewById(R.id.fragment2);

       OneFragment fragmentOne = new OneFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container,fragmentOne,fragmentOne.getTag()).commit();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OneFragment fragmentOne = new OneFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.container,fragmentOne,fragmentOne.getTag()).commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TwoFragment fragmentTwo = new TwoFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.container,fragmentTwo,fragmentTwo.getTag()).commit();
            }
        });

    }
}
