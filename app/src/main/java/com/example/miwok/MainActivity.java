package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView numbers, family, colors, phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbers = (TextView) findViewById(R.id.txtnumbers);
        family = (TextView) findViewById(R.id.txtfamily);
        colors = (TextView) findViewById(R.id.txtcolors);
        phrases = (TextView) findViewById(R.id.txtphrases);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbers = new Intent(MainActivity.this, paginanumbers.class);
                startActivity(numbers);
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent family = new Intent(MainActivity.this, paginafamily.class);
                startActivity(family);
            }
        });
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colors = new Intent(MainActivity.this, paginacolors.class);
                startActivity(colors);
            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrases = new Intent(MainActivity.this, paginaphrases.class);
                startActivity(phrases);
            }
        });
    }
}

